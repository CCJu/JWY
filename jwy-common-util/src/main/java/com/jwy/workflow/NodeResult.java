/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

import lombok.Builder;
import lombok.Data;

/**
 * 节点执行结果
 *
 * @author juchengcheng
 * @version : NodeResult.java,v 0.1 2020年03月13日 10:48
 */
@Data
@Builder
public class NodeResult {

    /**
     * 下一个节点的名称
     */
    private String nextName;

    /**
     * 是否还有后续节点
     */
    private boolean finish;

    /**
     * 工厂方法
     *
     * @return 节点执行结果
     */
    public static NodeResult finish() {
        return NodeResult.builder()
                .finish(true)
                .nextName(null)
                .build();
    }

    /**
     * 工厂方法
     *
     * @return 节点执行结果
     */
    public static NodeResult next(String nextName) {
        return NodeResult.builder()
                .finish(false)
                .nextName(nextName)
                .build();
    }
}
