/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.approve.api;

import com.jwy.approve.domain.ApproveApplyRequest;
import com.jwy.approve.domain.ApproveRequest;
import com.jwy.approve.domain.ApproveResult;

/**
 * @author juchengcheng
 * @version : ApproveFacade.java,v 0.1 2020年05月08日 23:27
 */
public interface ApproveFacade {

    /**
     * 提交审批
     * @param request 审批请求
     * @return 审批ID
     */
    ApproveResult<String> applyApprove(ApproveApplyRequest request);

    /**
     * 审批
     * @param request 审批请求
     * @return 审批ID
     */
    ApproveResult<Boolean> approve(ApproveRequest request);


}