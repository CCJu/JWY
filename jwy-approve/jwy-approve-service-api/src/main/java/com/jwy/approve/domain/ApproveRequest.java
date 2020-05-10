/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.approve.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 审批请求
 *
 * @author juchengcheng
 * @version : FurloughRequest.java,v 0.1 2020年01月28日 15:18
 */
@Data
public class ApproveRequest implements Serializable {

    private static final long serialVersionUID = 6499982996951638960L;

    /**
     * 审批ID
     */
    private String approveId;

    /**
     * 审批状态
     */
    private String status;

    /**
     * 审批人ID
     */
    private String userId;

}
