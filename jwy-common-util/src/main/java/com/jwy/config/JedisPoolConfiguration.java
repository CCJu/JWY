/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.config;

import com.jwy.domain.JedisConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;

/**
 * Jedis配置
 *
 * @author juchengcheng
 * @version : JedisPoolConfig.java,v 0.1 2020年03月23日 11:08
 */
@Configuration
public class JedisPoolConfiguration {

    @Resource
    private JedisConfig config;

    @Bean
    public JedisPool factory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(config.getMax_idle());
        jedisPoolConfig.setMaxWaitMillis(config.getMax_wait());
        jedisPoolConfig.setMaxTotal(config.getMax_active());
        jedisPoolConfig.setMinIdle(config.getMin_idle());
        return new JedisPool(jedisPoolConfig,
                config.getHost(),
                config.getPort(),
                config.getTimeout(), config.getPassword());
    }

}
