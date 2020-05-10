/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.approve.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用dubbo返回结果
 *
 * @author juchengcheng
 * @version : JwyResult.java,v 0.1 2020年03月18日 10:26
 */
@Data
public class ApproveResult<T> implements Serializable {

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

    /**
     * 构造成功结果
     *
     * @param data 返回数据
     * @return 通用返回结果
     */
    public static <T> ApproveResult<T> success(T data) {
        ApproveResult<T> result = new ApproveResult<T>();
        result.setData(data);
        result.setSuccess(true);
        return result;
    }

    /**
     * 构造失败结果
     *
     * @param errMsg 失败信息
     * @return 通用返回结果
     */
    public static <T> ApproveResult<T> fail(String errMsg) {
        ApproveResult<T> result = new ApproveResult<T>();
        result.setSuccess(false);
        result.setErrMsg(errMsg);
        return result;
    }
}
