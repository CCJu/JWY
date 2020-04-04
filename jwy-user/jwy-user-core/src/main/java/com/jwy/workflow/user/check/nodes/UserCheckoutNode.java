/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.check.nodes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.jwy.base.constant.RedisKey;
import com.jwy.domain.JwyRequest;
import com.jwy.domain.UserJurisdictionInfo;
import com.jwy.mapper.UserMapper;
import com.jwy.util.RedisService;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.check.UserCheckoutContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author juchengcheng
 * @version : UserCheckoutNode.java,v 0.1 2020年04月04日 19:57
 */
@Component
@Log4j2
public class UserCheckoutNode implements Node<UserCheckoutContext> {

    @Resource
    private RedisService redisService;

    @Resource
    private UserMapper userMapper;

    @Override
    public String getName() {
        return UserCheckoutNodeNames.USER_CHECKOUT;
    }

    @Override
    public NodeResult execute(UserCheckoutContext userCheckoutContext) {
        // 上下文获得校验请求
        JwyRequest request = userCheckoutContext.getRequest();
        // 校验token合法性
        String token = redisService.hget(RedisKey.Login.TOKEN_LIST, request.getUserId());
        if (StringUtils.isEmpty(token)) {
            log.error("token已过期");
            userCheckoutContext.setPass(false);
            return NodeResult.finish();
        }
        if (!request.getToken().equals(token)) {
            log.error("该token非当前用户持有");
            userCheckoutContext.setPass(false);
            return NodeResult.finish();
        }
        String data = redisService.hget(RedisKey.User.USER_JURISDICTION_LIST, request.getUserId());
        if (StringUtils.isEmpty(data)) {
            log.error("当前用户权限信息redis不存在");
            userCheckoutContext.setPass(false);
            return NodeResult.finish();
        } else {
            try {
                boolean isPass = false;
                List<UserJurisdictionInfo> userJurisdictionList = JSON.parseArray(data, UserJurisdictionInfo.class);
                for (UserJurisdictionInfo item : userJurisdictionList) {
                    if (item.getServiceUrl().equals(request.getServiceUrl())) {
                        isPass = true;
                        break;
                    }
                }
                userCheckoutContext.setPass(isPass);
                return NodeResult.finish();
            } catch (JSONException e) {
                userCheckoutContext.setPass(false);
                return NodeResult.finish();
            }
        }
    }
}
