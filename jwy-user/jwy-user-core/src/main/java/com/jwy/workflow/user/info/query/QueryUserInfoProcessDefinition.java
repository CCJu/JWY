/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.info.query;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 查询用户信息流程定义
 *
 * @author juchengcheng
 * @version : QueryUserInfoProcessDefinition.java,v 0.1 2020年04月04日 18:40
 */
@Component
public class QueryUserInfoProcessDefinition extends BaseProcessDefinition<QueryUserInfoContext> {

    protected QueryUserInfoProcessDefinition(List<Node<QueryUserInfoContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "查询用户信息";
    }

    @Override
    public QueryUserInfoContext createContext() {
        return new QueryUserInfoContext();
    }
}
