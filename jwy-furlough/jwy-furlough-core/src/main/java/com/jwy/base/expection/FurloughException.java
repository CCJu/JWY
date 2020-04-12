/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.base.expection;

import com.jwy.base.enums.FurloughErrorEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author juchengcheng
 * @version : UserExpection.java,v 0.1 2020年03月20日 14:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FurloughException extends RuntimeException {

    private static final long serialVersionUID = 8618544579047015563L;

    private FurloughErrorEnum errorEnum;

    public FurloughException(FurloughErrorEnum errorEnum) {
        this.errorEnum = errorEnum;
    }
}
