/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.entity;

import lombok.Data;

/**
 * @author juchengcheng
 * @version : UserInfoDto.java,v 0.1 2020年03月25日 20:54
 */
@Data
public class UserInfoDto {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 性别
     */
    private int gender;

    /**
     * 角色序号
     */
    private int roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 头像
     */
    private String headImg;

    /**
     * 微信号
     */
    private String wechatNo;

    /**
     * 院系
     */
    private String department;

    /**
     * 入学时间
     */
    private String enrolTime;

    /**
     * 信誉积分
     */
    private long score;
}
