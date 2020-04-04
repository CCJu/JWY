/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.check;

import com.jwy.domain.JwyRequest;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户校验上下文
 *
 * @author juchengcheng
 * @version : UserCheckoutContext.java,v 0.1 2020年04月04日 19:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserCheckoutContext extends BaseProcessContext {

    /**
     * 用户校验请求
     */
    private JwyRequest request;

    /**
     * 校验是否通过
     */
    private Boolean pass;
}
