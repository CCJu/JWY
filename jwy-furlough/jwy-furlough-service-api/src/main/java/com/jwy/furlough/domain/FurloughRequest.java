/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.furlough.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假请求
 *
 * @author juchengcheng
 * @version : FurloughRequest.java,v 0.1 2020年01月28日 15:18
 */
@Data
public class FurloughRequest implements Serializable {

    private static final long serialVersionUID = 6499982996951638960L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 请假理由
     */
    private String reason;

    /**
     * 请假类型
     */
    private String type;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 附件名
     */
    private String accessoryName;
}
