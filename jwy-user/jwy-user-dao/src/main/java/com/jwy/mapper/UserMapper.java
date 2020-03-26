/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.mapper;

import com.jwy.entity.UserInfoDto;
import com.jwy.entity.UserJurisdictionDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author juchengcheng
 * @version : LoginMapper.java,v 0.1 2020年03月25日 21:07
 */
@Repository
public interface UserMapper {

    /**
     * 用户信息查询
     *
     * @param userIds 用户ID
     * @return 用户信息列表
     */
    List<UserInfoDto> queryUserInfo(@Param("userIds") List<String> userIds);

    /**
     * 密码校验
     *
     * @param accountNo 账户
     * @param password  密码
     * @return 成功返回用户ID，失败不返回
     */
    String checkPassword(@Param("accountNo") String accountNo, @Param("password") String password);

    /**
     * 修改用户积分
     *
     * @param userId 用户ID
     * @param score  变更积分数
     * @return 修改结果
     */
    Integer updateUserScore(@Param("userId") String userId, @Param("score") int score);

    /**
     * 查询用户权限
     *
     * @param roleName 角色名
     * @param userId   用户ID
     * @return 用户权限列表
     */
    List<UserJurisdictionDto> queryUserJurisdiction(@Param("roleName") String roleName, @Param("userId") String userId);
}