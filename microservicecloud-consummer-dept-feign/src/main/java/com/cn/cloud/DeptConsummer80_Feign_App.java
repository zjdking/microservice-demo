package com.cn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 * 原来我一直疑惑，spring boot启动注解已经有componentScan 为何还要扫描，这个是扫描具有feign service的包的
 * 扫描的包是什么意思
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cn"})
@ComponentScan(basePackages = {"com.cn"})
public class DeptConsummer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsummer80_Feign_App.class,args);
    }
}
