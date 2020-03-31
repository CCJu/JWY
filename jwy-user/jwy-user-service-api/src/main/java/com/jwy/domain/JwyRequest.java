/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author juchengcheng
 * @version : JwyRequest.java,v 0.1 2020年03月26日 11:42
 */
@Data
public class JwyRequest implements Serializable {

    private static final long serialVersionUID = 7485901908094833004L;

    private String userId;

    private String serviceUrl;

}
