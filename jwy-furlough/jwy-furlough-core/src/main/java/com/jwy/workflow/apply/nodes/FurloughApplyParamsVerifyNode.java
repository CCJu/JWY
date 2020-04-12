/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.jwy.base.enums.FurloughErrorEnum;
import com.jwy.base.enums.FurloughTypeEnum;
import com.jwy.base.expection.FurloughException;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.apply.FurloughApplyContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 请假申请流程参数校验节点
 *
 * @author juchengcheng
 * @version : FurloughApplyParamsVerifyNode.java,v 0.1 2020年04月12日 17:10
 */
@Component
@Log4j2
public class FurloughApplyParamsVerifyNode implements Node<FurloughApplyContext> {

    @Override
    public String getName() {
        return FurloughApplyNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(FurloughApplyContext furloughApplyContext) {
        // 上下文获得请假申请
        FurloughRequest request = furloughApplyContext.getRequest();
        if (request == null) {
            log.error("请假申请不为空");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_REQUEST_NULL);
        }
        // 用户ID不为空
        if (StringUtils.isEmpty(request.getUserId())) {
            log.error("请假申请用户ID为空");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_REQUEST_USER_ID_NULL);
        }
        // 请假理由不为空
        if (StringUtils.isEmpty(request.getReason())) {
            log.error("请假申请原因为空");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_REASON_NULL);
        }
        // 请假类型必须为合法枚举值
        if (FurloughTypeEnum.getByValue(request.getType()) == null) {
            log.error("请假类型为空或不是指定的枚举值{}", request.getType());
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_TYPE_ILLEGAL);
        }
        // 开始时间、结束时间不为空,且开始时间小于结束时间
        if (StringUtils.isEmpty(request.getStartTime())) {
            log.error("请假开始时间为空");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_STARTTIME_NULL);
        }
        if (StringUtils.isEmpty(request.getEndTime())) {
            log.error("请假结束时间为空");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_ENDTIME_NULL);
        }
        if (request.getStartTime().getTime() > request.getEndTime().getTime()) {
            log.error("请假时间区间非法");
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_TIME_SECTION_ILLEGAL);
        }
        // 竞争Redis锁
        return NodeResult.next(FurloughApplyNodeNames.TRY_REQUEST_LOCK);
    }
}
