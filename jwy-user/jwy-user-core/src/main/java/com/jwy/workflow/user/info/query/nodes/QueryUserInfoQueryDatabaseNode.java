/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.info.query.nodes;

import com.google.common.collect.Lists;
import com.jwy.domain.UserInfo;
import com.jwy.entity.UserInfoDto;
import com.jwy.mapper.UserMapper;
import com.jwy.mapstruct.UserInfoMapStruct;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.info.query.QueryUserInfoContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author juchengcheng
 * @version : QueryUserInfoQueryDatabaseNode.java,v 0.1 2020年04月04日 18:49
 */
@Component
@Log4j2
public class QueryUserInfoQueryDatabaseNode implements Node<QueryUserInfoContext> {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getName() {
        return QueryUserInfoNodeNames.QUERY_DATABASE;
    }

    @Override
    public NodeResult execute(QueryUserInfoContext queryUserInfoContext) {
        // 上下文获得待查询的用户id列表
        List<String> userIds = queryUserInfoContext.getRequest().getUserId();
        // 从数据库中查询出用户信息
        List<UserInfoDto> userInfoDtos = userMapper.queryUserInfo(userIds);
        // 初始化查询结果
        List<UserInfo> results = Lists.newArrayList();
        for (UserInfoDto item : userInfoDtos) {
            results.add(UserInfoMapStruct.MAPPER.toUserInfo(item));
        }
        // 将查询结果设置到上下文
        queryUserInfoContext.setUserInfos(results);
        // 流程结束
        return NodeResult.finish();
    }
}
