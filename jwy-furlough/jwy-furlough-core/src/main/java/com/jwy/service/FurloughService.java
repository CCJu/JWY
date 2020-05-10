/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.service;

import com.jwy.furlough.domain.FurloughQueryRequest;
import com.jwy.furlough.domain.FurloughRecord;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.furlough.domain.FurloughResult;
import com.jwy.workflow.FurloughSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 请假服务
 *
 * @author juchengcheng
 * @version : FurloughService.java,v 0.1 2020年04月12日 16:36
 */
@Component
public class FurloughService {

    @Resource
    private FurloughSupport furloughSupport;

    public FurloughResult<Void> furlough(FurloughRequest request) {
        try {
            furloughSupport.furlough(request);
            return FurloughResult.success(null);
        } catch (Throwable e) {
            return FurloughResult.fail(e.getMessage());
        }
    }

    public FurloughResult<FurloughRecord> queryFurloughDetail(FurloughQueryRequest queryRequest) {
        try {
            return FurloughResult.success(furloughSupport.queryFurloughDetail(queryRequest));
        } catch (Throwable e) {
            return FurloughResult.fail(e.getMessage());
        }
    }
}
