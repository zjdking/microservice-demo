package com.cn.springcloud.service;

import com.cn.microservicecloudapi.entities.Dept;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */

public interface DeptService {

    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
