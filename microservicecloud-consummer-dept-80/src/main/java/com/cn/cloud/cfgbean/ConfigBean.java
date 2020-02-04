package com.cn.cloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@Configuration
public class ConfigBean {
    @Bean
    // 默认是 客户端 负载均衡；需要和客户端整合；默认是轮询；可以自己书写。
    @LoadBalanced
    public RestTemplate restTemplate(){
        // restTemplet 类比jdbc redis ....  这东西就是一个可以操作xxx的一个模板
        // 提供了多种便捷访问http远程服务的方法；
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();// 随机； 如果保护添加这个默认就是
    }




}
