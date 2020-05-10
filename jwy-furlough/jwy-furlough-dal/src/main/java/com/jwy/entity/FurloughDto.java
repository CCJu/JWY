/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author juchengcheng
 * @version : FurloughDto.java,v 0.1 2020年04月12日 20:46
 */
@Data
@Builder
public class FurloughDto {

    private String vacateId;

    private String userId;

    private String userName;

    private String department;

    private String reason;

    private String userNumber;

    private String type;

    private String status;

    private String approveId;

    private String totalTime;

    private String startTime;

    private String endTime;

}
