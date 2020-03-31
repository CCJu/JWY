/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jwy.domain.*;
import com.jwy.facade.UserFacade;
import com.jwy.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 门面接口
 *
 * @author juchengcheng
 * @version : UserFacadeIpl.java,v 0.1 2020年03月18日 22:15
 */
@Service(version = "1.0.0")
public class UserFacadeImpl implements UserFacade {

    @Resource
    private UserService userService;

    @Override
    public UserResult<List<UserJurisdictionInfo>> queryUserJurisdiction(QueryJurisdictionRequest request) {
        return userService.queryUserJurisdiction(request);
    }

    @Override
    public UserResult<List<UserInfo>> queryUserInfo(QueryUserInfoRequest request) {
        return userService.queryUserInfo(request);
    }

    @Override
    public UserResult<Void> updateUserScore(String userId, int score) {
        return userService.updateUserScore(userId, score);
    }

    @Override
    public UserResult<Boolean> userCheckout(JwyRequest request) {
        return userService.userCheckout(request);
    }

}
