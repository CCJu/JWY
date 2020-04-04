/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.info.query.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.info.query.QueryUserInfoContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : QueryUserInfoFirstNode.java,v 0.1 2020年04月04日 18:43
 */
@Component
@Log4j2
public class QueryUserInfoFirstNode implements Node<QueryUserInfoContext> {


    @Override
    public String getName() {
        return QueryUserInfoNodeNames.FIRST;
    }

    @Override
    public NodeResult execute(QueryUserInfoContext queryUserInfoContext) {
        log.info("查询用户信息请求：{}", queryUserInfoContext.getRequest());
        return NodeResult.next(QueryUserInfoNodeNames.PARAMS_VERIFY);
    }
}
