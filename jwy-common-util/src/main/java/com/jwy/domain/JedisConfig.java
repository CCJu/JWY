/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : JedisConfig.java,v 0.1 2020年03月23日 11:12
 */
@Data
@Component
public class JedisConfig {

    @Value("${spring.redis.database}")
    private String database;

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.jedis.pool.max-active}")
    private int max_active;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private long max_wait;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private int max_idle;

    @Value("${spring.redis.jedis.pool.min-idle}")
    private int min_idle;

    @Value("${spring.redis.timeout}")
    private int timeout;

}
