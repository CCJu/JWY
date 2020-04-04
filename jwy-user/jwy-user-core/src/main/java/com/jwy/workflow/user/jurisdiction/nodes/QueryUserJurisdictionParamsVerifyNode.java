/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.jurisdiction.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.domain.QueryJurisdictionRequest;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.jurisdiction.QueryUserJurisdictionContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author juchengcheng
 * @version : QueryUserJurisdictionParamsVerifyNode.java,v 0.1 2020年04月01日 22:54
 */
@Component
@Log4j2
public class QueryUserJurisdictionParamsVerifyNode implements Node<QueryUserJurisdictionContext> {

    @Override
    public String getName() {
        return QueryUserJurisdictionNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(QueryUserJurisdictionContext queryUserJurisdictionContext) {
        QueryJurisdictionRequest request = queryUserJurisdictionContext.getRequest();
        if (request == null) {
            log.error("查询请求为空");
            throw new UserException(UserErrorEnum.QUERY_USER_JURISDICTION_REQUEST_NOT_NULL);
        }
        if (StringUtils.isEmpty(request.getRoleName())) {
            log.error("角色名为空");
            throw new UserException(UserErrorEnum.QUERY_USER_JURISDICTION_ROLE_NAME_NOT_NULL);
        }
        if (StringUtils.isEmpty(request.getUserId())) {
            log.error("用户ID为空");
            throw new UserException(UserErrorEnum.QUERY_USER_JURISDICTION_USER_ID_NOT_NULL);
        }
        return NodeResult.next(QueryUserJurisdictionNodeNames.QUERY_DATABASE);
    }
}
