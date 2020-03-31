/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.score.nodes;

import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.score.UpdateUserScoreContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author juchengcheng
 * @version : UpdateUserScoreFirstNode.java,v 0.1 2020年03月31日 23:14
 */
@Component
@Log4j2
public class UpdateUserScoreFirstNode implements Node<UpdateUserScoreContext> {

    @Override
    public String getName() {
        return "起始节点";
    }

    @Override
    public NodeResult execute(UpdateUserScoreContext updateUserScoreContext) {
        log.info("修改用户[{}]的积分[{}]", updateUserScoreContext.getUserId(), updateUserScoreContext.getScore());
        return NodeResult.next(UpdateUserScoreNodeNames.PARAMS_VERIFY);
    }
}
