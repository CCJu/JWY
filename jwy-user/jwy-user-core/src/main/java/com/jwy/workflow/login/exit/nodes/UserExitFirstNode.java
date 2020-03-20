/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.exit.UserExitContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : UserExitFirstNode.java,v 0.1 2020年03月20日 14:24
 */
@Component
@Log4j2
public class UserExitFirstNode implements Node<UserExitContext> {

    public String getName() {
        return UserExitNodeNames.FIRST;
    }

    public NodeResult execute(UserExitContext userExitContext) {
        log.info("用户退出登录，请求{}", userExitContext.getRequest());
        return NodeResult.next(UserExitNodeNames.PARAMS_VERIFY);
    }
}
