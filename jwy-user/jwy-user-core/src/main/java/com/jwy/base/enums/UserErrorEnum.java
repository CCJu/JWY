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
    QUERY_USER_INFO_NULL("QUERY_USER_INFO_NULL", "用户信息为空"),

    /**
     * 修改用户积分用户ID不能为空
     */
    UPDATE_SCORE_USER_ID_NOT_NULL("UPDATE_SCORE_USER_ID_NOT_NULL", "修改用户积分用户ID不能为空"),

    /**
     * 查询用户权限请求不为空
     */
    QUERY_USER_JURISDICTION_REQUEST_NOT_NULL("QUERY_USER_JURISDICTION_REQUEST_NOT_NULL", "查询用户权限请求不为空"),

    /**
     * 查询用户权限角色名不为空
     */
    QUERY_USER_JURISDICTION_ROLE_NAME_NOT_NULL("QUERY_USER_JURISDICTION_ROLE_NAME_NOT_NULL", "查询用户权限角色名不为空"),

    /**
     * 查询用户权限用户ID不为空
     */
    QUERY_USER_JURISDICTION_USER_ID_NOT_NULL("QUERY_USER_JURISDICTION_USER_ID_NOT_NULL", "查询用户权限用户ID不为空"),

    /**
     * 查询用户信息请求为空
     */
    QUERY_USER_INFO_REQUEST_NOT_NULL("QUERY_USER_INFO_NOT_NULL", "查询用户信息请求为空"),

    /**
     * 用户校验请求为空
     */
    USER_CHECKOUT_REQUEST_NULL("USER_CHECKOUT_REQUEST_NULL", "用户校验请求为空"),

    /**
     * 用户校验请求用户ID为空
     */
    USER_CHECKOUT_USER_ID_NULL("USER_CHECKOUT_USER_ID_NULL", "用户校验请求用户ID为空"),

    /**
     * 用户校验请求token为空
     */
    USER_CHECKOUT_TOKEN_NULL("USER_CHECKOUT_TOKEN_NULL", "用户校验请求token为空"),

    /**
     * 用户校验请求请求地址为空
     */
    USER_CHECKOUT_SERVICE_URL_NULL("USER_CHECKOUT_SERVICE_URL_NULL", "用户校验请求请求地址为空");

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
