/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询权限请求
 *
 * @author juchengcheng
 * @version : QueryJurisdictionRequest.java,v 0.1 2020年03月18日 10:47
 */
@Data
public class QueryJurisdictionRequest implements Serializable {

    private static final long serialVersionUID = 3951975342155501269L;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 用户ID
     */
    private String userId;
}
