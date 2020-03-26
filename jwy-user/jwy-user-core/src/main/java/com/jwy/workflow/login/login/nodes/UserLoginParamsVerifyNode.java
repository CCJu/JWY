/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.login.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.LoginRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.login.UserLoginContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author juchengcheng
 * @version : UserLoginParamsVerifyNode.java,v 0.1 2020年03月25日 20:41
 */
@Component
@Log4j2
public class UserLoginParamsVerifyNode implements Node<UserLoginContext> {

    @Override
    public String getName() {
        return UserLoginNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(UserLoginContext userLoginContext) {
        // 获得登录请求
        LoginRequest request = userLoginContext.getRequest();
        // 校验账户非空
        if (StringUtils.isEmpty(request.getAccountNumber())) {
            log.error("登录账户为空");
            throw new UserException(UserErrorEnum.LOGIN_ACCOUNT_NULL);
        }
        // 校验密码非空
        if (StringUtils.isEmpty(request.getPassword())) {
            log.error("登录密码为空");
            throw new UserException(UserErrorEnum.LOGIN_PASSWORD_NULL);
        }
        return NodeResult.next(UserLoginNodeNames.PASSWORD_CHECKOUT_AND_QUERY_USER_INFO);
    }
}
