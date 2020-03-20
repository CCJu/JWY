/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jwy.domain.ExitRequest;
import com.jwy.domain.LoginRequest;
import com.jwy.domain.LoginResponse;
import com.jwy.domain.UserResult;
import com.jwy.facade.LoginFacade;
import com.jwy.service.UserService;

import javax.annotation.Resource;

/**
 * @author juchengcheng
 * @version : LoginFacadeImpl.java,v 0.1 2020年03月19日 16:20
 */
@Service(version = "1.0.0")
public class LoginFacadeImpl implements LoginFacade {

    @Resource
    private UserService userService;

    public UserResult<LoginResponse> login(LoginRequest request) {
        return userService.login(request);
    }

    public UserResult<String> exit(ExitRequest request) {
        return userService.exit(request);
    }
}
