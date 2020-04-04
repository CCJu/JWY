/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.info.query.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.QueryUserInfoRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.info.query.QueryUserInfoContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : QueryUserInfoParamsVerifyNode.java,v 0.1 2020年04月04日 18:48
 */
@Component
@Log4j2
public class QueryUserInfoParamsVerifyNode implements Node<QueryUserInfoContext> {

    @Override
    public String getName() {
        return QueryUserInfoNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(QueryUserInfoContext queryUserInfoContext) {
        // 上下文获得查询请求
        QueryUserInfoRequest queryUserInfoRequest = queryUserInfoContext.getRequest();
        if (queryUserInfoRequest == null ||
                queryUserInfoRequest.getUserId() == null ||
                queryUserInfoRequest.getUserId().size() == 0) {
            log.error("查询用户信息查询请求为空");
            throw new UserException(UserErrorEnum.QUERY_USER_INFO_REQUEST_NOT_NULL);
        }
        // 查询数据库
        return NodeResult.next(QueryUserInfoNodeNames.QUERY_DATABASE);
    }
}
