package com.cn.springcloud.controller;

import com.cn.microservicecloudapi.entities.Dept;
import com.cn.springcloud.service.DeptService;
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

    @RequestMapping(value="/dept/add" ,method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){// 当前端传递json 对象的时候要在对象上添加 RequstBody
        return deptService.add(dept);
    }
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable Long id){ // 可以获取到 {} 中的参数值
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list" ,method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
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
