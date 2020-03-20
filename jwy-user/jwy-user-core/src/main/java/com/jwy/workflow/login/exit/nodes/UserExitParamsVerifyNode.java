/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.ExitRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.exit.UserExitContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 参数校验
 *
 * @author juchengcheng
 * @version : UserExitParamsVerifyNode.java,v 0.1 2020年03月20日 14:44
 */
@Component
@Log4j2
public class UserExitParamsVerifyNode implements Node<UserExitContext> {

    public String getName() {
        return UserExitNodeNames.PARAMS_VERIFY;
    }

    public NodeResult execute(UserExitContext userExitContext) {
        // 上下文获得退出请求
        ExitRequest request = userExitContext.getRequest();
        if (request == null) {
            log.error("用户退出请求为空");
            throw new UserException(UserErrorEnum.EXIT_REQUEST_NULL);
        }
        if (StringUtils.isEmpty(request.getUserId())) {
            log.error("退出请求用户ID为空");
            throw new UserException(UserErrorEnum.EXIT_REQUEST_USER_ID_NULL);
        }
        return NodeResult.next(UserExitNodeNames.REMOVE_TOKEN_IN_REDIS);
    }
}
