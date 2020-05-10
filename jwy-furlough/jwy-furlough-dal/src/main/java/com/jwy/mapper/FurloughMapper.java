/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.mapper;

import com.jwy.entity.FurloughDto;
import org.springframework.stereotype.Repository;

/**
 * @author juchengcheng
 * @version : FurloughMapper.java,v 0.1 2020年04月12日 20:46
 */
@Repository
public interface FurloughMapper {

    void add(FurloughDto furloughDto);

    void callback(String approveId);

}
