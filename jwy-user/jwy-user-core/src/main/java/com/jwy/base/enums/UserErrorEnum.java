/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.base.enums;

import com.jwy.domain.BaseEnum;
import lombok.AllArgsConstructor;

/**
 * 用户异常枚举
 *
 * @author juchengcheng
 * @version : UserErrorEnum.java,v 0.1 2020年03月20日 14:46
 */
@AllArgsConstructor
public enum UserErrorEnum implements BaseEnum<String> {

    /**
     * 退出请求为空
     */
    EXIT_REQUEST_NULL("EXIT_REQUEST_NULL", "退出请求为空"),

    /**
     * 退出登录请求用户ID为空
     */
    EXIT_REQUEST_USER_ID_NULL("EXIT_REQUEST_USER_ID_NULL", "退出登录请求用户ID为空"),

    /**
     * 登录账户为空
     */
    LOGIN_ACCOUNT_NULL("LOGIN_ACCOUNT_NULL", "登录账户为空"),

    /**
     * 登录密码为空
     */
    LOGIN_PASSWORD_NULL("LOGIN_PASSWORD_NULL", "登录密码为空"),

    /**
     * 账户密码不匹配
     */
    PASSWORD_ERROR("PASSWORD_ERROR", "账户密码不匹配"),

    /**
     * 用户信息为空
     */
    QUERY_USER_INFO_NULL("QUERY_USER_INFO_NULL", "用户信息为空");

    /**
     * 错误值
     */
    private String errValue;

    /**
     * 错误信息
     */
    private String errMsg;

    @Override
    public String getValue() {
        return errValue;
    }

    @Override
    public String getDesc() {
        return errMsg;
    }
}
