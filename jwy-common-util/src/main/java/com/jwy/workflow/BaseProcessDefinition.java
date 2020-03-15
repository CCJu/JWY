/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 流程定义
 *
 * @author juchengcheng
 * @version : BaseProcessDefinition.java,v 0.1 2020年03月13日 11:25
 */
public abstract class BaseProcessDefinition<T extends BaseProcessContext> implements ProcessDefinition<T> {

    private Map<String, Node<T>> nodeMap = Maps.newHashMap();

    protected BaseProcessDefinition(List<Node<T>> nodes) {
        for (Node<T> item : nodes) {
            nodeMap.put(item.getName(), item);
        }
    }

    @Override
    public Node<T> getNodeByName(String nodeName) {
        return nodeMap.get(nodeName);
    }
}
