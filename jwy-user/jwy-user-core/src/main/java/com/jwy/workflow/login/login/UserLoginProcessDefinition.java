/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.login;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 登录流程定义
 *
 * @author juchengcheng
 * @version : UserLoginProcessDefinition.java,v 0.1 2020年03月25日 20:27
 */
@Component
public class UserLoginProcessDefinition extends BaseProcessDefinition<UserLoginContext> {

    protected UserLoginProcessDefinition(List<Node<UserLoginContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "登录流程";
    }

    @Override
    public UserLoginContext createContext() {
        return new UserLoginContext();
    }
}
