/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author juchengcheng
 * @version : JwyUserApplication.java,v 0.1 2020年03月18日 20:03
 */
@SpringBootApplication(scanBasePackages = {"com.jwy"})
@Log4j2
public class JwyUserApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JwyUserApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = app.run(args);
        context.addApplicationListener(new ApplicationPidFileWriter());
        log.info("JWY-USER 启动成功！");
    }
}
