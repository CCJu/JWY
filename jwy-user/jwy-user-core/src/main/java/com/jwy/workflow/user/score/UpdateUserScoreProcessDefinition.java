/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.score;

import com.jwy.workflow.BaseProcessDefinition;
import com.jwy.workflow.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 修改用户积分流程定义
 *
 * @author juchengcheng
 * @version : UpdateUserScoreProcessDefinition.java,v 0.1 2020年03月31日 23:09
 */
@Component
public class UpdateUserScoreProcessDefinition extends BaseProcessDefinition<UpdateUserScoreContext> {

    protected UpdateUserScoreProcessDefinition(List<Node<UpdateUserScoreContext>> nodes) {
        super(nodes);
    }

    @Override
    public String getName() {
        return "修改用户积分";
    }

    @Override
    public UpdateUserScoreContext createContext() {
        return new UpdateUserScoreContext();
    }
}
