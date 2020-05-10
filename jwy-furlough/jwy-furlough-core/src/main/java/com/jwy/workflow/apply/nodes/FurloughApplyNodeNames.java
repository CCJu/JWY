/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply.nodes;

import com.jwy.workflow.NodeNames;

/**
 * 请假申请流程节点名称
 *
 * @author juchengcheng
 * @version : FurloughApplyNodeNames.java,v 0.1 2020年04月12日 16:49
 */
interface FurloughApplyNodeNames extends NodeNames {

    String PARAMS_VERIFY = "参数校验";

    String TRY_REQUEST_LOCK = "竞争Redis锁";

    String SAVE_DATA = "保存数据";

    String SEND_APPROVE = "发送审批";
}