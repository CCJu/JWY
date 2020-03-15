/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

/**
 * @author juchengcheng
 * @version : ProcessDefinition.java,v 0.1 2020年03月13日 11:33
 */
public interface ProcessDefinition<T extends BaseProcessContext> {

    /**
     * 返回流程名
     *
     * @return 流程名
     */
    public String getName();

    /**
     * 创建流程上下文
     *
     * @return 流程上下文
     */
    public T createContext();

    /**
     * 获取流程节点通过节点名称
     *
     * @param nodeName 节点名称
     * @return 节点
     */
    public Node<T> getNodeByName(String nodeName);
}