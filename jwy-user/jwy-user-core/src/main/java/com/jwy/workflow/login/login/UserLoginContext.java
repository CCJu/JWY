/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.login;

import com.jwy.domain.LoginRequest;
import com.jwy.domain.LoginResponse;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 登录流程上下文
 *
 * @author juchengcheng
 * @version : UserLoginContext.java,v 0.1 2020年03月25日 20:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserLoginContext extends BaseProcessContext {

    /**
     * 登录请求
     */
    private LoginRequest request;

    /**
     * 登录响应
     */
    private LoginResponse response;
}
