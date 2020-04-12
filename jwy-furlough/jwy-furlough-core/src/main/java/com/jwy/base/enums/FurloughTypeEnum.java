/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.base.enums;

import com.jwy.domain.BaseEnum;
import lombok.AllArgsConstructor;

/**
 * 请假类型枚举
 *
 * @author juchengcheng
 * @version : FurloughTypeEnum.java,v 0.1 2020年04月12日 17:28
 */
@AllArgsConstructor
public enum FurloughTypeEnum implements BaseEnum<String> {
    /**
     * 事假
     */
    WORK("WORK", "事假"),

    /**
     * 病假
     */
    SICK("SICK", "病假");

    private String value;

    private String desc;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    /**
     * 根据值获取请假类型枚举
     *
     * @param value 请假类型
     * @return 请假类型枚举实例
     */
    public static FurloughTypeEnum getByValue(String value) {
        for (FurloughTypeEnum item : FurloughTypeEnum.values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}