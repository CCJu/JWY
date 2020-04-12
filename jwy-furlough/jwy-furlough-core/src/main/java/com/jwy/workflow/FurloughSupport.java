/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.workflow;

import com.jwy.furlough.domain.FurloughQueryRequest;
import com.jwy.furlough.domain.FurloughRecord;
import com.jwy.furlough.domain.FurloughRequest;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author juchengcheng
 * @version : FurloughSupport.java,v 0.1 2020年04月12日 16:37
 */
@Component
public class FurloughSupport {

    @Resource
    private Engine engine;

    public void furlough(FurloughRequest request) {
        return;
    }

    public FurloughRecord queryFurloughDetail(FurloughQueryRequest queryRequest) {
        return null;
    }
}
