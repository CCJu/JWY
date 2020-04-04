/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.check.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.check.UserCheckoutContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : UserCheckoutFirstNode.java,v 0.1 2020&#x5e74;04&#x6708;04&#x65e5; 19:44
 */
@Component
@Log4j2
public class UserCheckoutFirstNode implements Node<UserCheckoutContext> {

    @Override
    public String getName() {
        return UserCheckoutNodeNames.FIRST;
    }

    @Override
    public NodeResult execute(UserCheckoutContext userCheckoutContext) {
        log.info("用户校验请求：{}", userCheckoutContext.getRequest());
        return NodeResult.next(UserCheckoutNodeNames.PARAMS_VERIFY);
    }
}
