/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.jwy.base.enums.FurloughErrorEnum;
import com.jwy.base.expection.FurloughException;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.util.RedisService;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.apply.FurloughApplyContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.MessageFormat;

/**
 * 请假申请流程竞争Redis锁节点
 *
 * @author juchengcheng
 * @version : FurloughApplyTryLockNode.java,v 0.1 2020年04月12日 17:40
 */
@Component
@Log4j2
public class FurloughApplyTryLockNode implements Node<FurloughApplyContext> {

    @Resource
    private RedisService redisService;

    @Override
    public String getName() {
        return FurloughApplyNodeNames.TRY_REQUEST_LOCK;
    }

    @Override
    public NodeResult execute(FurloughApplyContext furloughApplyContext) {
        // 上下文获取请假请求
        FurloughRequest request = furloughApplyContext.getRequest();
        // 拼装RedisKey
        String key = "jwy:furlough:lock:{0}:{1}";
        key = MessageFormat.format(key, request.getUserId(), request.getType());
        // 竞争Redis锁
        if (redisService.setnx(key, "LOCK") == 1) {
            // 设置Key两秒过期
            redisService.expire(key, 2);
            // 保存数据
            return NodeResult.next(FurloughApplyNodeNames.SAVE_DATA);
        } else {
            log.error("用户{}请假申请过于频繁", request.getUserId());
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_REQUEST_REPETITION);
        }
    }
}
