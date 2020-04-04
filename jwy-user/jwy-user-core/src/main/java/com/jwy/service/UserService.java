/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.service;

import com.jwy.base.expection.UserException;
import com.jwy.domain.*;
import com.jwy.workflow.login.LoginSupport;
import com.jwy.workflow.user.UserSupport;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务
 *
 * @author juchengcheng
 * @version : UserService.java,v 0.1 2020年03月20日 14:07
 */
@Service
@Log4j2
public class UserService {

    @Resource
    private LoginSupport loginSupport;

    @Resource
    private UserSupport userSupport;

    public UserResult<LoginResponse> login(LoginRequest request) {
        try {
            return UserResult.success(loginSupport.login(request));
        } catch (UserException e) {
            log.error("用户登录异常", e);
            return UserResult.fail(e.getErrorEnum().getDesc());
        } catch (Throwable e) {
            log.error("用户登录捕捉到异常", e);
            return UserResult.fail(e.getMessage());
        }
    }

    public UserResult<String> exit(ExitRequest request) {
        try {
            loginSupport.exit(request);
            return UserResult.success("退出登录成功");
        } catch (UserException e) {
            log.error("用户退出登录异常", e);
            return UserResult.fail(e.getErrorEnum().getDesc());
        } catch (Throwable e) {
            log.error("用户退出登录捕捉到异常", e);
            return UserResult.fail(e.getMessage());
        }
    }

    public UserResult<List<UserJurisdictionInfo>> queryUserJurisdiction(QueryJurisdictionRequest request) {
        try {
            return UserResult.success(userSupport.queryUserJurisdictionInfos(request));
        } catch (UserException e) {
            log.error("查询用户权限异常", e);
            return UserResult.fail(e.getErrorEnum().getDesc());
        } catch (Throwable e) {
            log.error("查询用户权限捕捉到异常", e);
            return UserResult.fail(e.getMessage());
        }
    }

    public UserResult<List<UserInfo>> queryUserInfo(QueryUserInfoRequest request) {
        try {
            return UserResult.success(userSupport.queryUserInfo(request));
        } catch (UserException e) {
            log.error("查询用户信息异常", e);
            return UserResult.fail(e.getErrorEnum().getDesc());
        } catch (Throwable e) {
            log.error("查询用户信息捕捉到异常", e);
            return UserResult.fail(e.getMessage());
        }
    }

    public UserResult<Void> updateUserScore(String userId, int score) {
        try {
            userSupport.updateUserScore(userId, score);
            return UserResult.success(null);
        } catch (UserException e) {
            log.error("更新用户积分异常", e);
            return UserResult.fail(e.getErrorEnum().getDesc());
        } catch (Throwable e) {
            log.error("更新用户积分捕捉到异常", e);
            return UserResult.fail(e.getMessage());
        }
    }

    public UserResult<Boolean> userCheckout(JwyRequest request) {
        return null;
    }
}
