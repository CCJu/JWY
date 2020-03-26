/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login;

import com.jwy.domain.ExitRequest;
import com.jwy.domain.LoginRequest;
import com.jwy.domain.LoginResponse;
import com.jwy.workflow.Engine;
import com.jwy.workflow.login.exit.UserExitContext;
import com.jwy.workflow.login.exit.UserExitProcessDefinition;
import com.jwy.workflow.login.login.UserLoginContext;
import com.jwy.workflow.login.login.UserLoginProcessDefinition;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 登录入口
 *
 * @author juchengcheng
 * @version : LoginSupport.java,v 0.1 2020年03月20日 14:08
 */
@Component
public class LoginSupport {

    @Resource
    private Engine engine;

    @Resource
    private UserExitProcessDefinition exitProcessDefinition;

    @Resource
    private UserLoginProcessDefinition loginProcessDefinition;

    /**
     * 退出流程
     *
     * @param request 用户退出请求
     */
    public void exit(ExitRequest request) {
        // 创建流程上下文
        UserExitContext context = exitProcessDefinition.createContext();
        // 设置退出登录请求到流程上下文
        context.setRequest(request);
        // 执行流程
        engine.execute(context, exitProcessDefinition);
    }

    /**
     * 登录流程
     *
     * @param request 登录请求
     * @return 登录响应
     */
    public LoginResponse login(LoginRequest request) {
        // 创建流程上下文
        UserLoginContext context = loginProcessDefinition.createContext();
        // 设置登录请求到上下文
        context.setRequest(request);
        // 执行流程
        engine.execute(context, loginProcessDefinition);
        // 返回结果
        return context.getResponse();
    }

}
