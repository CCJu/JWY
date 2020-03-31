/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.score;

import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 修改用户积分上下文
 *
 * @author juchengcheng
 * @version : UpdateUserScoreContext.java,v 0.1 2020年03月31日 23:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateUserScoreContext extends BaseProcessContext {

    /**
     *
     */
    private String userId;

    /**
     *
     */
    private int score;
}
