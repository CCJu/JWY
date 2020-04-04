/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.jurisdiction.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.jurisdiction.QueryUserJurisdictionContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : QueryUserJurisdictionFirstNode.java,v 0.1 2020年03月31日 23:43
 */
@Component
@Log4j2
public class QueryUserJurisdictionFirstNode implements Node<QueryUserJurisdictionContext> {

    @Override
    public String getName() {
        return QueryUserJurisdictionNodeNames.FIRST;
    }

    @Override
    public NodeResult execute(QueryUserJurisdictionContext queryUserJurisdictionContext) {
        log.info("查询权限请求{}", queryUserJurisdictionContext.getRequest());
        return NodeResult.next(QueryUserJurisdictionNodeNames.PARAMS_VERIFY);
    }
}
