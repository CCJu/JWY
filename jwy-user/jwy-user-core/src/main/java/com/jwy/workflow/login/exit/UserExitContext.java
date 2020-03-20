/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.login.exit;

import com.jwy.domain.ExitRequest;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户退出流程上下文
 *
 * @author juchengcheng
 * @version : UserExitContext.java,v 0.1 2020年03月20日 14:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserExitContext extends BaseProcessContext {

    /**
     * 退出请求
     */
    private ExitRequest request;


}
