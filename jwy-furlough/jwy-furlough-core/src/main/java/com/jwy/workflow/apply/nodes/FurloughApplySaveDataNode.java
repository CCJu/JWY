/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.common.collect.Lists;
import com.jwy.base.enums.FurloughErrorEnum;
import com.jwy.base.expection.FurloughException;
import com.jwy.domain.QueryUserInfoRequest;
import com.jwy.domain.UserInfo;
import com.jwy.domain.UserResult;
import com.jwy.facade.UserFacade;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.apply.FurloughApplyContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 请假申请流程爆出数据节点
 *
 * @author juchengcheng
 * @version : FurloughApplySaveDataNode.java,v 0.1 2020年04月12日 18:00
 */
@Component
@Log4j2
public class FurloughApplySaveDataNode implements Node<FurloughApplyContext> {

    @Reference(version = "1.0.0", check = false)
    private UserFacade userFacade;

    @Override
    public String getName() {
        return FurloughApplyNodeNames.SAVE_DATA;
    }

    @Override
    public NodeResult execute(FurloughApplyContext furloughApplyContext) {
        // 上下文获取请假申请
        FurloughRequest request = furloughApplyContext.getRequest();
        // 构造查询用户信息请求
        QueryUserInfoRequest queryUserInfoRequest = new QueryUserInfoRequest();
        queryUserInfoRequest.setUserId(Lists.newArrayList(request.getUserId()));
        // 根据用户ID查询用户信息
        UserResult<List<UserInfo>> result = userFacade.queryUserInfo(queryUserInfoRequest);
        UserInfo userInfo;
        // 解析dubbo响应结果
        if (result != null &&
                result.isSuccess() &&
                result.getData() != null) {
            userInfo = result.getData().get(0);
        } else {
            log.error("无法根据请假请求中的用户ID{}查询到用户信息", request.getUserId());
            throw new FurloughException(FurloughErrorEnum.FURLOUGH_REQUEST_USER_ID_ILLEGAL);
        }
        // 构造请假DTO

        // 保存请假信息到数据库

        // 发送审批
        return NodeResult.next(FurloughApplyNodeNames.SEND_APPROVE);
    }
}
