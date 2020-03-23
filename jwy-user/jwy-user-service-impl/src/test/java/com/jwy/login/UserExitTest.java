/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy.login;

import com.alibaba.fastjson.JSON;
import com.jwy.JwyUserApplication;
import com.jwy.domain.ExitRequest;
import com.jwy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author juchengcheng
 * @version : UserExitTest.java,v 0.1 2020年03月23日 09:58
 */
@SpringBootTest(classes = JwyUserApplication.class)
@RunWith(SpringRunner.class)
public class UserExitTest {

    @Resource
    private UserService service;

    @Test
    public void test() {
        ExitRequest request = new ExitRequest();
        request.setUserId("123123");
        System.out.println(JSON.toJSONString(service.exit(request)));

    }
}
