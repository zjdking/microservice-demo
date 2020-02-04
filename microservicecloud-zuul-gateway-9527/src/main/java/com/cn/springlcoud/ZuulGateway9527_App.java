package com.cn.springlcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zjdking
 * 2020/2/3 0003.
 * @version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527_App {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527_App.class,args);
    }
}
