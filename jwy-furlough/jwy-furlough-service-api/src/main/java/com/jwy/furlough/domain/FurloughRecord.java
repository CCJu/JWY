/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.furlough.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假记录
 *
 * @author juchengcheng
 * @version : FurloughRecord.java,v 0.1 2020年02月02日 13:16
 */
@Data
public class FurloughRecord implements Serializable {

    private static final long serialVersionUID = 5934575268881115211L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 查询ID（vacateId、adjustId）
     */
    private String queryId;

    /**
     * 请假类型
     */
    private String type;

    /**
     * 请假状态
     */
    private String status;


    /**
     * 请假总时长
     */
    private long totalTime;

    /**
     * 起始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

}
