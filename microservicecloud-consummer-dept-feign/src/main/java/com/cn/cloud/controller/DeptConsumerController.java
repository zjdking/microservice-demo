package com.cn.cloud.controller;

import com.cn.microservicecloudapi.entities.Dept;
import com.cn.microservicecloudapi.service.DeptClientServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private  DeptClientServcie deptClientServcie;

    @RequestMapping(value = "/consumer/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptClientServcie.add(dept);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable Long id){
        return deptClientServcie.get(id);
    }
    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientServcie.list();
    }


}
