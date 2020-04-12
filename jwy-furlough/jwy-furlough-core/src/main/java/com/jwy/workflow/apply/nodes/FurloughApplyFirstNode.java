/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.apply.FurloughApplyContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * 请假申请流程起始节点
 *
 * @author juchengcheng
 * @version : FurloughApplyFirstNode.java,v 0.1 2020年04月12日 17:06
 */
@Component
@Log4j2
public class FurloughApplyFirstNode implements Node<FurloughApplyContext> {

    @Override
    public String getName() {
        return FurloughApplyNodeNames.FIRST;
    }

    @Override
    public NodeResult execute(FurloughApplyContext furloughApplyContext) {
        log.info("请假申请流程原始请求：{}", furloughApplyContext.getRequest());
        return NodeResult.next(FurloughApplyNodeNames.PARAMS_VERIFY);
    }
}
