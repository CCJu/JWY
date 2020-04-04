/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.jurisdiction.nodes;

import com.google.common.collect.Lists;
import com.jwy.domain.QueryJurisdictionRequest;
import com.jwy.domain.UserJurisdictionInfo;
import com.jwy.entity.UserJurisdictionDto;
import com.jwy.mapper.UserMapper;
import com.jwy.mapstruct.UserJurisdictionMapStruct;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.jurisdiction.QueryUserJurisdictionContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author juchengcheng
 * @version : QueryUserJurisdictionQueryDatabaseNode.java,v 0.1 2020年04月01日 23:21
 */
@Component
@Log4j2
public class QueryUserJurisdictionQueryDatabaseNode implements Node<QueryUserJurisdictionContext> {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getName() {
        return QueryUserJurisdictionNodeNames.QUERY_DATABASE;
    }

    @Override
    public NodeResult execute(QueryUserJurisdictionContext queryUserJurisdictionContext) {
        QueryJurisdictionRequest request = queryUserJurisdictionContext.getRequest();
        List<UserJurisdictionDto> result = userMapper.queryUserJurisdiction(request.getRoleName(), request.getUserId());
        // 初始化返回结果
        List<UserJurisdictionInfo> userJurisdictionInfos = Lists.newArrayList();
        for (UserJurisdictionDto item : result) {
            userJurisdictionInfos.add(UserJurisdictionMapStruct.MAPPER.toUserJurisdictionInfo(item));
        }
        // 将用户信息存入上下文
        queryUserJurisdictionContext.setUserJurisdictionInfos(userJurisdictionInfos);
        return NodeResult.finish();
    }
}
