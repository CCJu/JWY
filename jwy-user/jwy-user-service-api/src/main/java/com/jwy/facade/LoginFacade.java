/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.facade;

import com.jwy.domain.ExitRequest;
import com.jwy.domain.LoginRequest;
import com.jwy.domain.LoginResponse;
import com.jwy.domain.UserResult;

/**
 * @author juchengcheng
 * @version : LoginFacade.java,v 0.1 2020年03月19日 15:56
 */
public interface LoginFacade {

    /**
     * 登录
     *
     * @param request 登录请求（账户+密码）
     * @return 登录结果（成功返回token，异常返回错误信息）
     */
    UserResult<LoginResponse> login(LoginRequest request);

    /**
     * 推出登录
     *
     * @param request 用户ID
     * @return 结果
     */
    UserResult<String> exit(ExitRequest request);
}
