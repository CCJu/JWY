/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user;

import com.jwy.domain.*;
import com.jwy.workflow.Engine;
import com.jwy.workflow.user.check.UserCheckoutContext;
import com.jwy.workflow.user.check.UserCheckoutProcessDefinition;
import com.jwy.workflow.user.info.query.QueryUserInfoContext;
import com.jwy.workflow.user.info.query.QueryUserInfoProcessDefinition;
import com.jwy.workflow.user.jurisdiction.QueryUserJurisdictionContext;
import com.jwy.workflow.user.jurisdiction.QueryUserJurisdictionProcessDefinition;
import com.jwy.workflow.user.score.UpdateUserScoreContext;
import com.jwy.workflow.user.score.UpdateUserScoreProcessDefinition;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务入口
 *
 * @author juchengcheng
 * @version : UserSupport.java,v 0.1 2020年03月31日 23:02
 */
@Component
@Log4j2
public class UserSupport {

    @Resource
    private Engine engine;

    @Resource
    private UpdateUserScoreProcessDefinition updateUserScoreProcessDefinition;

    @Resource
    private QueryUserJurisdictionProcessDefinition queryUserJurisdictionProcessDefinition;

    @Resource
    private QueryUserInfoProcessDefinition queryUserInfoProcessDefinition;

    @Resource
    private UserCheckoutProcessDefinition userCheckoutProcessDefinition;

    /**
     * 修改用户积分
     *
     * @param userId 用户ID
     * @param score  变更积分
     */
    public void updateUserScore(String userId, int score) {
        // 创建上下文
        UpdateUserScoreContext context = updateUserScoreProcessDefinition.createContext();
        // 设置上下文
        context.setScore(score);
        context.setUserId(userId);
        // 执行流程
        engine.execute(context, updateUserScoreProcessDefinition);
    }

    /**
     * 查询用户权限信息列表
     *
     * @param request 查询请求
     * @return 用户权限信息列表
     */
    public List<UserJurisdictionInfo> queryUserJurisdictionInfos(QueryJurisdictionRequest request) {
        // 创建上下文
        QueryUserJurisdictionContext context = queryUserJurisdictionProcessDefinition.createContext();
        // 设置上下文
        context.setRequest(request);
        // 执行流程
        engine.execute(context, queryUserJurisdictionProcessDefinition);
        // 返回结果
        return context.getUserJurisdictionInfos();
    }

    /**
     * 查询用户信息
     *
     * @param request 查询请求
     * @return 用户信息列表
     */
    public List<UserInfo> queryUserInfo(QueryUserInfoRequest request) {
        // 创建上下文
        QueryUserInfoContext context = queryUserInfoProcessDefinition.createContext();
        // 设置上下文
        context.setRequest(request);
        // 执行流程
        engine.execute(context, queryUserInfoProcessDefinition);
        // 返回结果
        return context.getUserInfos();
    }

    /**
     * 用户校验请求
     *
     * @param request 请求参数
     * @return 是否通过
     */
    public Boolean userCheckout(JwyRequest request) {
        // 创建上下文
        UserCheckoutContext context = userCheckoutProcessDefinition.createContext();
        // 设置上下文
        context.setRequest(request);
        // 执行流程
        engine.execute(context, userCheckoutProcessDefinition);
        // 返回结果
        return context.getPass();
    }
}
