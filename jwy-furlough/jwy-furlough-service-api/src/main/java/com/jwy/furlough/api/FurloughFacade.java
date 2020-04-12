/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.furlough.api;

import com.jwy.furlough.domain.FurloughQueryRequest;
import com.jwy.furlough.domain.FurloughRecord;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.furlough.domain.FurloughResult;

/**
 * 请假模块门面类
 *
 * @author juchengcheng
 * @version : FurloughFacade.java,v 0.1 2020年01月28日 15:16
 */
public interface FurloughFacade {

    /**
     * 请假接口
     *
     * @param request 请假请求
     * @return 响应
     */
    FurloughResult<Void> furlough(FurloughRequest request);

    /**
     * 查询请假记录详情
     *
     * @param queryRequest 查询请求
     * @return 请假记录详情
     */
    FurloughResult<FurloughRecord> queryFurloughDetail(FurloughQueryRequest queryRequest);
}