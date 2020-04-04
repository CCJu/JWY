/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.jurisdiction;

import com.jwy.domain.QueryJurisdictionRequest;
import com.jwy.domain.UserJurisdictionInfo;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author juchengcheng
 * @version : QueryUserJurisdictionContext.java,v 0.1 2020年03月31日 23:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryUserJurisdictionContext extends BaseProcessContext {

    /**
     * 查询权限请求
     */
    private QueryJurisdictionRequest request;

    /**
     * 用户权限信息列表
     */
    private List<UserJurisdictionInfo> userJurisdictionInfos;
}
