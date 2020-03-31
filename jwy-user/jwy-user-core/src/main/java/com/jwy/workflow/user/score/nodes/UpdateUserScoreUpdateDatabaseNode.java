/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.score.nodes;

import com.jwy.mapper.UserMapper;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.score.UpdateUserScoreContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 更新数据库
 *
 * @author juchengcheng
 * @version : UpdateUserScoreUpdateDatabaseNode.java,v 0.1 2020年03月31日 23:23
 */
@Component
@Slf4j
public class UpdateUserScoreUpdateDatabaseNode implements Node<UpdateUserScoreContext> {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getName() {
        return UpdateUserScoreNodeNames.UPDATE_DATABASE;
    }

    @Override
    public NodeResult execute(UpdateUserScoreContext updateUserScoreContext) {
        // 修改积分
        userMapper.updateUserScore(updateUserScoreContext.getUserId(), updateUserScoreContext.getScore());
        return NodeResult.finish();
    }
}
