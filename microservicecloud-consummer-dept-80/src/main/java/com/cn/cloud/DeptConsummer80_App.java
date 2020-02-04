package com.cn.cloud;

import com.cn.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
// 给哪一个微服务 添加  负载均衡算法；
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsummer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsummer80_App.class,args);
    }
}
