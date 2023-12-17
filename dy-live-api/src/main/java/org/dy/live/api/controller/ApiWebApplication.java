package org.dy.live.api.controller;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class ApiWebApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
//        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(ApiWebApplication.class,args);
    }


}
