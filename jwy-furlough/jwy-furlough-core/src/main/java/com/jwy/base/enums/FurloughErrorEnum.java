/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.base.enums;

import com.jwy.domain.BaseEnum;
import lombok.AllArgsConstructor;

/**
 * 请假异常枚举
 *
 * @author juchengcheng
 * @version : UserErrorEnum.java,v 0.1 2020年03月20日 14:46
 */
@AllArgsConstructor
public enum FurloughErrorEnum implements BaseEnum<String> {

    /**
     * 请假请求为空
     */
    FURLOUGH_REQUEST_NULL("FURLOUGH_REQUEST_NULL", "请假请求为空"),

    /**
     * 请假请求用户ID为空
     */
    FURLOUGH_REQUEST_USER_ID_NULL("FURLOUGH_REQUEST_USER_ID_NULL", "请假请求用户ID为空"),

    /**
     * 请假原因为空
     */
    FURLOUGH_REASON_NULL("FURLOUGH_REASON_NULL", "请假原因为空"),

    /**
     * 请假类型非法
     */
    FURLOUGH_TYPE_ILLEGAL("FURLOUGH_TYPE_ILLEGAL", "请假类型非法"),

    /**
     * 请假开始时间为空
     */
    FURLOUGH_STARTTIME_NULL("FURLOUGH_STARTTIME_NULL", "请假开始时间为空"),

    /**
     * 请假结束时间为空
     */
    FURLOUGH_ENDTIME_NULL("FURLOUGH_ENDTIME_NULL", "请假结束时间为空"),

    /**
     * 请假时间区间非法
     */
    FURLOUGH_TIME_SECTION_ILLEGAL("FURLOUGH_TIME_SECTION_ILLEGAL", "请假时间区间非法"),

    /**
     * 请假请求过于频繁
     */
    FURLOUGH_REQUEST_REPETITION("FURLOUGH_REQUEST_REPETITION", "请假请求过于频繁"),

    /**
     * 请假请求用户ID非法
     */
    FURLOUGH_REQUEST_USER_ID_ILLEGAL("FURLOUGH_REQUEST_USER_ID_ILLEGAL", "请假请求用户ID非法");

//    /**
//     * 修改用户积分用户ID不能为空
//     */
//    UPDATE_SCORE_USER_ID_NOT_NULL("UPDATE_SCORE_USER_ID_NOT_NULL", "修改用户积分用户ID不能为空"),
//
//    /**
//     * 查询用户权限请求不为空
//     */
//    QUERY_USER_JURISDICTION_REQUEST_NOT_NULL("QUERY_USER_JURISDICTION_REQUEST_NOT_NULL", "查询用户权限请求不为空"),
//
//    /**
//     * 查询用户权限角色名不为空
//     */
//    QUERY_USER_JURISDICTION_ROLE_NAME_NOT_NULL("QUERY_USER_JURISDICTION_ROLE_NAME_NOT_NULL", "查询用户权限角色名不为空"),
//
//    /**
//     * 查询用户权限用户ID不为空
//     */
//    QUERY_USER_JURISDICTION_USER_ID_NOT_NULL("QUERY_USER_JURISDICTION_USER_ID_NOT_NULL", "查询用户权限用户ID不为空"),
//
//    /**
//     * 查询用户信息请求为空
//     */
//    QUERY_USER_INFO_REQUEST_NOT_NULL("QUERY_USER_INFO_NOT_NULL", "查询用户信息请求为空"),
//
//    /**
//     * 用户校验请求为空
//     */
//    USER_CHECKOUT_REQUEST_NULL("USER_CHECKOUT_REQUEST_NULL", "用户校验请求为空"),
//
//    /**
//     * 用户校验请求用户ID为空
//     */
//    USER_CHECKOUT_USER_ID_NULL("USER_CHECKOUT_USER_ID_NULL", "用户校验请求用户ID为空"),
//
//    /**
//     * 用户校验请求token为空
//     */
//    USER_CHECKOUT_TOKEN_NULL("USER_CHECKOUT_TOKEN_NULL", "用户校验请求token为空"),
//
//    /**
//     * 用户校验请求请求地址为空
//     */
//    USER_CHECKOUT_SERVICE_URL_NULL("USER_CHECKOUT_SERVICE_URL_NULL", "用户校验请求请求地址为空");

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
