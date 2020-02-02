/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis服务
 *
 * @author juchengcheng
 * @version : RedisService.java,v 0.1 2020年01月31日 13:36
 */
@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@Component
public final class RedisService {

    @Autowired(required = false)
    private JedisPool jedisPool;

    /**
     * redis写入成功标记
     */
    private final String WRITE_OK = "OK";

    /**
     * 存入hash类型值
     *
     * @param key   key
     * @param field 字段
     * @param value 待存入值
     * @return 存入结果
     */
    public Long hset(String key, String field, String value) {
        Jedis jedis = getResource();
        try {
            return jedis.hset(key, field, value);
        } finally {
            release(jedis);
        }
    }

    /**
     * 存入String类型值
     *
     * @param key   key
     * @param value 待存入的值
     * @return 存入结果
     */
    public long set(String key, String value) {
        Jedis jedis = getResource();
        try {
            String result = jedis.set(key, value);
            if (result != null && WRITE_OK.equals(result.toUpperCase())) {
                return 1;
            } else {
                return 0;
            }
        } finally {
            release(jedis);
        }
    }

    /**
     * 获得存储在redis中的值
     *
     * @param key key
     * @return 存储的值
     */
    public String get(String key) {
        Jedis jedis = getResource();
        try {
            return jedis.get(key);
        } finally {
            release(jedis);
        }
    }

    /**
     * 获得存储在redis中的值
     *
     * @param key   key
     * @param field 字段
     * @return 存储的值
     */
    public String hget(String key, String field) {
        Jedis jedis = getResource();
        try {
            return jedis.hget(key, field);
        } finally {
            release(jedis);
        }
    }

    /**
     * 删除redis Key和其存储的值
     *
     * @param keys 待删除的key
     * @return 操作结果
     */
    public Long del(String... keys) {
        Jedis jedis = getResource();
        try {
            return jedis.del(keys);
        } finally {
            release(jedis);
        }
    }

    /**
     * 删除Hash中的某个字段
     *
     * @param key    key
     * @param fields 字段列表
     * @return 操作结果
     */
    public Long hdel(String key, String... fields) {
        Jedis jedis = getResource();
        try {
            return jedis.hdel(key, fields);
        } finally {
            release(jedis);
        }
    }

    /**
     * redis 写入值
     *
     * @param key   key
     * @param value value
     * @return 写入结果
     */
    public Long setnx(String key, String value) {
        Jedis jedis = getResource();
        try {
            return jedis.setnx(key, value);
        } finally {
            release(jedis);
        }
    }

    /**
     * 设置键过期时间
     *
     * @param key     key
     * @param seconds 过期时间
     * @return 操作结果
     */
    public Long expire(String key, int seconds) {
        Jedis jedis = getResource();
        try {
            return jedis.expire(key, seconds);
        } finally {
            release(jedis);
        }
    }

    /**
     * 获得Jedis资源
     */
    private Jedis getResource() {
        return jedisPool.getResource();
    }

    /**
     * 释放资源
     */
    private void release(Jedis jedis) {
        jedis.close();
    }
}
