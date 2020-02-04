package com.cn.springcloud.controller;

import com.cn.microservicecloudapi.entities.Dept;
import com.cn.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@RestController
//  要给前端返回json串，这个是controller + responsebody = restcontroller;
public class DeptController {
    @Autowired
    DeptService deptService;
    @Autowired
    DiscoveryClient discoveryClient;


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable Long id){ // 可以获取到 {} 中的参数值
        Dept dept = deptService.get(id);
        if(null==dept){
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    /**
     * 对于出现异常我们改怎么处理 我们就需要调用hystrix 方法
     * 为了下边可以使用chain进行设置值，lombok 需要使用 @Accessors(chain=true)
     * 但是这种方式是一个方法都要进行 一个对应的hystrix 导致代码膨胀，可以通aop 异常通知的形式进行处理；
     * @return
     */
    public Dept processHystrix_Get(@PathVariable Long id){
        return new Dept().setDeptno(id)
                .setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }


}
