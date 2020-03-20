/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

/**
 * @author juchengcheng
 * @version : BaseEnum.java,v 0.1 2020年03月20日 14:47
 */
public interface BaseEnum<T> {

    /**
     * 获得枚举值
     *
     * @return 枚举值
     */
    public T getValue();

    /**
     * 获得枚举描述
     *
     * @return 枚举描述
     */
    public String getDesc();
}