/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow.user.info.query;

import com.jwy.domain.QueryUserInfoRequest;
import com.jwy.domain.UserInfo;
import com.jwy.workflow.BaseProcessContext;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询用户信息上下文
 *
 * @author juchengcheng
 * @version : QueryUserInfoContext.java,v 0.1 2020年04月04日 18:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryUserInfoContext extends BaseProcessContext {

    /**
     * 用户信息查询请求
     */
    private QueryUserInfoRequest request;

    /**
     * 用户信息集合
     */
    private List<UserInfo> userInfos;
}
