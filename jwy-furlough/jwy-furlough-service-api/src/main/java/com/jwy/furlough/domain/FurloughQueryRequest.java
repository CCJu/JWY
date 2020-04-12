/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.furlough.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 请假查询请求
 *
 * @author juchengcheng
 * @version : FurloughQueryRequest.java,v 0.1 2020年04月12日 12:08
 */
@Data
public class FurloughQueryRequest implements Serializable {

    private static final long serialVersionUID = -7911725098189441681L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 查询ID（vacateId、adjustId）
     */
    private String queryId;
}
