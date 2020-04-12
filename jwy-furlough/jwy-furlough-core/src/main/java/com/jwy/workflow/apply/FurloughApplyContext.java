/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.apply;

import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 请假申请流程上下文
 *
 * @author juchengcheng
 * @version : FurloughApplyContext.java,v 0.1 2020年04月12日 16:44
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FurloughApplyContext extends BaseProcessContext {

    /**
     * 请假申请请求
     */
    private FurloughRequest request;
}
