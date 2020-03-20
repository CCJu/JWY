/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.base.domain;

/**
 * Redis Key
 *
 * @author juchengcheng
 * @version : RedisKey.java,v 0.1 2020年03月20日 14:12
 */
public interface RedisKey {

    interface Login {

        /**
         * 存放登录后生成的token
         */
        String TOKEN_LIST = "jwy:user:token_list";

        /**
         * 存放缓存的用户信息
         */
        String USER_INFO_LIST = "jwy:user:user_info_list";
    }

    interface User {

    }
}