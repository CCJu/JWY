/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.jurisdiction;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 查询用户权限流程定义
 *
 * @author juchengcheng
 * @version : QueryUserJurisdictionProcessDefinition.java,v 0.1 2020年03月31日 23:39
 */
@Component
public class QueryUserJurisdictionProcessDefinition extends BaseProcessDefinition<QueryUserJurisdictionContext> {

    protected QueryUserJurisdictionProcessDefinition(List<Node<QueryUserJurisdictionContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "查询用户权限信息";
    }

    @Override
    public QueryUserJurisdictionContext createContext() {
        return new QueryUserJurisdictionContext();
    }
}
