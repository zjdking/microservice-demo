package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author zjdking
 * 2020/2/3 0003.
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer9001_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001_Dashboard_App.class,args);
    }
}
