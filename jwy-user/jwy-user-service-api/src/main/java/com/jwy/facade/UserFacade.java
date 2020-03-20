/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.facade;

import com.jwy.domain.*;

import java.util.List;

/**
 * @author juchengcheng
 * @version : UserFacade.java,v 0.1 2020年03月16日 21:16
 */
public interface UserFacade {

    /**
     * 查询用户权限信息
     *
     * @param request 查询请求
     * @return 查询结果
     */
    UserResult<List<UserJurisdictionInfo>> queryUserJurisdiction(QueryJurisdictionRequest request);

    /**
     * 查询用户信息
     *
     * @param request 查询请求（用户ID）
     * @return 用户信息
     */
    UserResult<List<UserInfo>> queryUserInfo(QueryUserInfoRequest request);

    /**
     * 修改用户信誉积分
     *
     * @param userId 用户ID
     * @param score  待修改积分（增加/减少）
     * @return 修改结果
     */
    UserResult<String> updateUserScore(String userId, int score);
}