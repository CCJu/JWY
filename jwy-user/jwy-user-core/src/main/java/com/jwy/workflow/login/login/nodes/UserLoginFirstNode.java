/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.login.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.login.UserLoginContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : UserLoginFirstNode.java,v 0.1 2020年03月25日 20:39
 */
@Component
@Log4j2
public class UserLoginFirstNode implements Node<UserLoginContext> {

    @Override
    public String getName() {
        return UserLoginNodeNames.FIRST;
    }

    @Override
    public NodeResult execute(UserLoginContext userLoginContext) {
        log.info("登录原始请求{}", userLoginContext.getRequest());
        return NodeResult.next(UserLoginNodeNames.PARAMS_VERIFY);
    }
}
