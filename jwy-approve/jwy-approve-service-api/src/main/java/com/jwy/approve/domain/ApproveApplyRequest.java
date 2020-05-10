/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.approve.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 审批请求
 *
 * @author juchengcheng
 * @version : FurloughRequest.java,v 0.1 2020年01月28日 15:18
 */
@Data
public class ApproveApplyRequest implements Serializable {

    private static final long serialVersionUID = 6499982996951638960L;

    /**
     * 请假ID
     */
    private String vacateId;

    /**
     * 用户ID
     */
    private String userId;

}
