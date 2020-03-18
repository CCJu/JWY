/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询用户信息请求
 *
 * @author juchengcheng
 * @version : QueryUserInfoRequest.java,v 0.1 2020年03月18日 14:32
 */
@Data
public class QueryUserInfoRequest implements Serializable {

    private static final long serialVersionUID = 1860505411985727896L;

    /**
     * 用户ID
     */
    private List<String> userId;

}
