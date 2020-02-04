package com.cn.springcloud.service.impl;

import com.cn.microservicecloudapi.entities.Dept;
import com.cn.springcloud.dao.DeptDao;
import com.cn.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}