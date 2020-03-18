/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * denglu xiangy
 *
 * @author juchengcheng
 * @version : LoginResponse.java,v 0.1 2020年03月18日 14:38
 */
@Data
public class LoginResponse implements Serializable {

    private static final long serialVersionUID = -952557249641997888L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * token
     */
    private String token;

    /**
     * 用户信息
     */
    private UserInfo userInfo;
}
