/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit.nodes;

import com.jwy.workflow.NodeNames;

/**
 * 用户退出节点名称
 *
 * @author juchengcheng
 * @version : UserExitNodeNames.java,v 0.1 2020年03月20日 14:18
 */
interface UserExitNodeNames extends NodeNames {

    String PARAMS_VERIFY = "参数校验";

    String REMOVE_TOKEN_IN_REDIS = "删除用户TOKEN信息";
}