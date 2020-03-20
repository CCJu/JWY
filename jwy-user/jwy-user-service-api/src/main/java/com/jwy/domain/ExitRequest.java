/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 推出请求
 *
 * @author juchengcheng
 * @version : ExitRequest.java,v 0.1 2020年03月19日 15:59
 */
@Data
public class ExitRequest implements Serializable {

    private static final long serialVersionUID = 8850080781485112900L;

    /**
     * 用户ID
     */
    private String userId;
}
