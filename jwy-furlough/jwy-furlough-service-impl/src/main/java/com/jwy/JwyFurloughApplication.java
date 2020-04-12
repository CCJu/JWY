/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.jwy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author juchengcheng
 * @version : JwyFurloughApplication.java,v 0.1 2020年04月12日 11:17
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.jwy"})
//@MapperScan("com.jwy.mapper")
@Log4j2
public class JwyFurloughApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JwyFurloughApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = app.run(args);
        context.addApplicationListener(new ApplicationPidFileWriter());
        log.info("JWY-FURLOUGH 启动成功！");
    }
}
