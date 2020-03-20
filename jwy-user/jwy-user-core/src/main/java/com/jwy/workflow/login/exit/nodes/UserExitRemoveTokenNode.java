/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit.nodes;

import com.jwy.base.domain.RedisKey;
import com.jwy.util.RedisService;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.exit.UserExitContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : UserExitRemoveTokenNode.java,v 0.1 2020年03月20日 15:01
 */
@Component
@Log4j2
public class UserExitRemoveTokenNode implements Node<UserExitContext> {

    @Autowired
    private RedisService redisService;

    public String getName() {
        return UserExitNodeNames.REMOVE_TOKEN_IN_REDIS;
    }

    public NodeResult execute(UserExitContext userExitContext) {
        // 获取用户ID
        String userId = userExitContext.getRequest().getUserId();
        // 删除redis中用户的token
        redisService.hdel(RedisKey.Login.TOKEN_LIST, userId);
        // 删除缓存的用户信息
        redisService.hdel(RedisKey.Login.USER_INFO_LIST, userId);
        log.info("退出登录成功");
        return NodeResult.finish();
    }
}
