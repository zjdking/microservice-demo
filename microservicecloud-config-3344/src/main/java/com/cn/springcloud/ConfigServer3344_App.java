package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zjdking
 * 2020/2/4 0004.
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344_App.class,args);
    }
}
