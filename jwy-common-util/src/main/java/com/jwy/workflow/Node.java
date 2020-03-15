/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

/**
 * @author juchengcheng
 * @version : Node.java,v 0.1 2020年03月13日 10:45
 */
public interface Node<T extends BaseProcessContext> {

    /**
     * 返回节点名称
     *
     * @return 节点
     */
    public String getName();

    /**
     * 执行
     *
     * @param context 流程上下文
     * @return 节点执行结果
     */
    public NodeResult execute(T context);
}