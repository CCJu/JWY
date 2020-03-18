/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用dubbo返回结果
 *
 * @author juchengcheng
 * @version : JwyResult.java,v 0.1 2020年03月18日 10:26
 */
@Data
public class UserResult<T> implements Serializable {

    private static final long serialVersionUID = 6334406222689105525L;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 错误信息
     */
    private String errMsg;
}
