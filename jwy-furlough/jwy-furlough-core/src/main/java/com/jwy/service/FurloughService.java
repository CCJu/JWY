/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.service;

import com.jwy.furlough.domain.FurloughQueryRequest;
import com.jwy.furlough.domain.FurloughRecord;
import com.jwy.furlough.domain.FurloughRequest;
import com.jwy.furlough.domain.FurloughResult;
import org.springframework.stereotype.Component;

/**
 * 请假服务
 *
 * @author juchengcheng
 * @version : FurloughService.java,v 0.1 2020年04月12日 16:36
 */
@Component
public class FurloughService {

    public FurloughResult<Void> furlough(FurloughRequest request) {
        return null;
    }

    public FurloughResult<FurloughRecord> queryFurloughDetail(FurloughQueryRequest queryRequest) {
        return null;
    }
}
