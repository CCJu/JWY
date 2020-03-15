/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 流程
 *
 * @author juchengcheng
 * @version : Engine.java,v 0.1 2020年03月13日 11:44
 */
@Component
@Slf4j
public class Engine {

    public Engine() {

    }

    public <T extends BaseProcessContext> void execute(T t, BaseProcessDefinition<T> processDefinition) {
        this.execute(t, processDefinition, NodeNames.FIRST);
    }

    private <T extends BaseProcessContext> void execute(T t, BaseProcessDefinition<T> processDefinition, String nodeName) {
        // 流程中获取节点
        Node<T> node = processDefinition.getNodeByName(nodeName);
        if (node == null) {
            log.error("无法获取节点");
            return;
        }
        try {
            NodeResult result = node.execute(t);
            if (!result.isFinish()) {
                this.execute(t, processDefinition, result.getNextName());
            }
        } catch (Throwable e) {
            log.error("捕捉到异常", e);
        }
    }
}
