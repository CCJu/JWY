/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 请假申请流程定义
 *
 * @author juchengcheng
 * @version : FurloughApplyProcessDefinition.java,v 0.1 2020年04月12日 16:45
 */
@Component
public class FurloughApplyProcessDefinition extends BaseProcessDefinition<FurloughApplyContext> {

    protected FurloughApplyProcessDefinition(List<Node<FurloughApplyContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "请假申请流程";
    }

    @Override
    public FurloughApplyContext createContext() {
        return new FurloughApplyContext();
    }
}
