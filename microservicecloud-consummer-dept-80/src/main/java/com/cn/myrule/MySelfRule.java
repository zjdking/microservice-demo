package com.cn.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 要了解spring boot 的启动，这样才可以自定义组件，然后进行加载；
 * @author zjdking
 * 2020/2/3 0003.
 * @version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule rule(){
//        return new RandomRule();
        return new MyRandomRule();
    }
}
