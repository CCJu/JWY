/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户退出流程定义
 *
 * @author juchengcheng
 * @version : UserExitProcessDefinition.java,v 0.1 2020年03月20日 14:15
 */
@Component
public class UserExitProcessDefinition extends BaseProcessDefinition<UserExitContext> {

    protected UserExitProcessDefinition(List<Node<UserExitContext>> nodes) {
        super(nodes);
    }

    public String getName() {
        return "用户退出登录流程";
    }

    public UserExitContext createContext() {
        return new UserExitContext();
    }
}
