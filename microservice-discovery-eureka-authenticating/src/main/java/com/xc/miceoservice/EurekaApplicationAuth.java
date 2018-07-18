package com.xc.miceoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xc on 2018/7/10.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationAuth {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationAuth.class, args);
    }
}
