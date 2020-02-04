package com.cn.microservicecloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringBootApplication

public class MicroservicecloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudApiApplication.class, args);
    }

}
