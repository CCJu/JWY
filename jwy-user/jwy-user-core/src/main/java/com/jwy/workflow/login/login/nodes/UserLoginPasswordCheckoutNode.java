/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.login.nodes;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.jwy.base.constant.RedisKey;
import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.LoginRequest;
import com.jwy.domain.LoginResponse;
import com.jwy.domain.UserInfo;
import com.jwy.domain.UserJurisdictionInfo;
import com.jwy.entity.UserInfoDto;
import com.jwy.entity.UserJurisdictionDto;
import com.jwy.mapper.UserMapper;
import com.jwy.mapstruct.UserInfoMapStruct;
import com.jwy.mapstruct.UserJurisdictionMapStruct;
import com.jwy.util.RedisService;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.login.login.UserLoginContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author juchengcheng
 * @version : UserLoginPasswordCheckoutNode.java,v 0.1 2020年03月25日 20:52
 */
@Component
@Log4j2
public class UserLoginPasswordCheckoutNode implements Node<UserLoginContext> {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisService redisService;

    @Override
    public String getName() {
        return UserLoginNodeNames.PASSWORD_CHECKOUT_AND_QUERY_USER_INFO;
    }

    @Override
    public NodeResult execute(UserLoginContext userLoginContext) {
        LoginRequest request = userLoginContext.getRequest();
        // 查询数据库，比对登录账户和密码
        String userId = userMapper.checkPassword(request.getAccountNumber(), request.getPassword());
        if (StringUtils.isEmpty(userId)) {
            log.error("账户密码不匹配");
            throw new UserException(UserErrorEnum.PASSWORD_ERROR);
        }
        // 查询用户信息
        List<String> userIds = Lists.newArrayList(userId);
        List<UserInfoDto> userInfoDtos = userMapper.queryUserInfo(userIds);
        if (userInfoDtos == null || userInfoDtos.size() == 0) {
            log.error("{}用户信息为空", userId);
            throw new UserException(UserErrorEnum.QUERY_USER_INFO_NULL);
        } else {
            // 获取用户信息
            UserInfo userInfo = UserInfoMapStruct.MAPPER.toUserInfo(userInfoDtos.get(0));
            // 将用户信息存入redis
            redisService.hset(RedisKey.Login.USER_INFO_LIST, userId, JSON.toJSONString(userInfo));
            // 生成TOKEN
            String token = UUID.randomUUID().toString();
            // 将TOKEN存入redis
            redisService.hset(RedisKey.Login.TOKEN_LIST, userId, token);
            // 构造登录响应
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setToken(token);
            loginResponse.setUserId(userId);
            loginResponse.setUserInfo(userInfo);
            // 将登录响应设置到上下文
            userLoginContext.setResponse(loginResponse);
            // 查询用户权限信息，将权限信息存入redis
            List<UserJurisdictionDto> userJurisdictionDtos = userMapper.queryUserJurisdiction(userInfo.getRoleName(), userId);
            List<UserJurisdictionInfo> userJurisdictionInfos = Lists.newArrayList();
            for (UserJurisdictionDto item : userJurisdictionDtos) {
                userJurisdictionInfos.add(UserJurisdictionMapStruct.MAPPER.toUserJurisdictionInfo(item));
            }
            redisService.hset(RedisKey.User.USER_JURISDICTION_LIST, userId, JSON.toJSONString(userJurisdictionInfos));
        }
        return NodeResult.finish();
    }
}
