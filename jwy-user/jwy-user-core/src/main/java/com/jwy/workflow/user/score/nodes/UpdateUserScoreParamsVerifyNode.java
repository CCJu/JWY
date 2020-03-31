/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.score.nodes;

import com.jwy.base.enums.UserErrorEnum;
import com.jwy.base.expection.UserException;
import com.jwy.workflow.Node;
import com.jwy.workflow.NodeResult;
import com.jwy.workflow.user.score.UpdateUserScoreContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 参数校验
 *
 * @author juchengcheng
 * @version : UpdateUserScoreParamsVerifyNode.java,v 0.1 2020年03月31日 23:19
 */
@Component
@Log4j2
public class UpdateUserScoreParamsVerifyNode implements Node<UpdateUserScoreContext> {

    @Override
    public String getName() {
        return UpdateUserScoreNodeNames.PARAMS_VERIFY;
    }

    @Override
    public NodeResult execute(UpdateUserScoreContext updateUserScoreContext) {
        if (StringUtils.isEmpty(updateUserScoreContext.getUserId())) {
            log.error("用户ID为空");
            throw new UserException(UserErrorEnum.UPDATE_SCORE_USER_ID_NOT_NULL);
        }
        return NodeResult.next(UpdateUserScoreNodeNames.UPDATE_DATABASE);
    }
}
