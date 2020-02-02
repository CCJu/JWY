/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.util;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 数据工具类
 * 1. 数据生成
 * 2. 数据格式化
 *
 * @author juchengcheng
 * @version : DataGenerateUtil.java,v 0.1 2020年01月31日 10:21
 */
@Component
public final class DataUtils {

    private final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 生成新的UUID
     *
     * @return 随机字符串
     */
    public String newUUID() {
        String id = UUID.randomUUID().toString();
        return id.replaceAll(id, "-");
    }

    /**
     * 生成当前日期字符串
     *
     * @return 当前日期
     */
    public String newDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 生成ID
     *
     * @param size ID长度
     * @return 生成ID
     */
    public long newId(int size) {
        String id = String.valueOf(Math.random());
        return Long.parseLong(id.substring(1, size + 1));
    }

    /**
     * 将String格式的日期转换Date实例
     *
     * @param date 日期
     * @return date实例
     * @throws ParseException 转换异常
     */
    public Date parseDate(String date) throws ParseException {
        return new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse(date);
    }

    /**
     * 返回时间date自1970年开始的日期的毫秒数
     *
     * @param date 日期
     * @return 距1970年日期的毫秒数
     */
    public long parseDateToLong(String date) throws ParseException {
        Date d = new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse(date);
        return d.getTime();
    }
}
