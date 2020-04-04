/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.check.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.JwyRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.check.UserCheckoutContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author juchengcheng
 * @version : UserCheckoutParamsVerifyNode.java,v 0.1 2020年04月04日 19:47
 */
@Component
@Slf4j
public class UserCheckoutParamsVerifyNode implements Node<UserCheckoutContext> {

    @Override
    public String getName() {
        return UserCheckoutNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(UserCheckoutContext userCheckoutContext) {
        // 上下文获得校验请求
        JwyRequest request = userCheckoutContext.getRequest();
        if (request == null) {
            log.error("用户校验请求为空");
            throw new UserException(UserErrorEnum.USER_CHECKOUT_REQUEST_NULL);
        }
        if (StringUtils.isEmpty(request.getUserId())) {
            log.error("用户ID为空");
            throw new UserException(UserErrorEnum.USER_CHECKOUT_USER_ID_NULL);
        }
        if (StringUtils.isEmpty(request.getToken())) {
            log.error("token为空");
            throw new UserException(UserErrorEnum.USER_CHECKOUT_TOKEN_NULL);
        }
        if (StringUtils.isEmpty(request.getServiceUrl())) {
            log.error("请求地址为空");
            throw new UserException(UserErrorEnum.USER_CHECKOUT_SERVICE_URL_NULL);
        }
        return NodeResult.next(UserCheckoutNodeNames.USER_CHECKOUT);
    }
}
