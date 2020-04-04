/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.check;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户校验流程定义
 *
 * @author juchengcheng
 * @version : UserCheckoutProcessDefinition.java,v 0.1 2020年04月04日 19:16
 */
@Component
public class UserCheckoutProcessDefinition extends BaseProcessDefinition<UserCheckoutContext> {

    protected UserCheckoutProcessDefinition(List<Node<UserCheckoutContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "用户校验";
    }

    @Override
    public UserCheckoutContext createContext() {
        return new UserCheckoutContext();
    }
}
