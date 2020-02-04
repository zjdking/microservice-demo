package com.cn.cloud.controller;

import com.cn.microservicecloudapi.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@RestController
public class DeptConsumerController {
//    private static final String REST_URL_PREFIX="http://localhost:8001";
    // 通过服务名称获取   这里的服务名称就是 provider中的名字；
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";


    @Autowired
    RestTemplate template;

    /**
     * postForObject url http rest请求的地址， 参数对象，返回值类型
     * get           url, 返回值类型
     * @param dept
     * @return
     */
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return template.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return template.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return template.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    // 服务的发现，就可以可以得到一个服务的信息；没啥太大用处

    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery(){
        return template.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}
