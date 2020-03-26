/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.mapstruct;

import com.jwy.domain.UserInfo;
import com.jwy.entity.UserInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author juchengcheng
 * @version : UserInfoMapper.java,v 0.1 2020年03月26日 11:11
 */
@Mapper
public interface UserInfoMapStruct {

    /**
     * MAPPER
     */
    UserInfoMapStruct MAPPER = Mappers.getMapper(UserInfoMapStruct.class);

    UserInfo toUserInfo(UserInfoDto orderRecord);
}