/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jwy.furlough.api.FurloughFacade;
import com.jwy.furlough.domain.FurloughQueryRequest;
import com.jwy.furlough.domain.FurloughRecord;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.furlough.domain.FurloughResult;
import com.jwy.service.FurloughService;

import javax.annotation.Resource;

/**
 * @author juchengcheng
 * @version : FurloughFacadeImpl.java,v 0.1 2020年04月12日 16:30
 */
@Service(version = "1.0.0")
public class FurloughFacadeImpl implements FurloughFacade {

    @Resource
    private FurloughService furloughService;


    @Override
    public FurloughResult<Void> furlough(FurloughRequest request) {
        return furloughService.furlough(request);
    }

    @Override
    public FurloughResult<FurloughRecord> queryFurloughDetail(FurloughQueryRequest queryRequest) {
        return furloughService.queryFurloughDetail(queryRequest);
    }
}
