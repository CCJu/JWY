/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录请求
 *
 * @author juchengcheng
 * @version : LoginRequest.java,v 0.1 2020年03月18日 10:38
 */
@Data
public class LoginRequest implements Serializable {

    private static final long serialVersionUID = -3780362640960185050L;

    /**
     * 账户
     */
    private String accountNumber;

    /**
     * 密码
     */
    private String password;

}
