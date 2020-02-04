package com.cn.springcloud.dao;

import com.cn.microservicecloudapi.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/1 0001.
 * @version 1.0
 */
@Mapper
// spring boot 和mybatis整合接口上一定更要添加注解
public interface DeptDao {
    /**
     * 添加
     * @param dept
     * @return
     */
     boolean addDept(Dept dept);

    /**
     * 通过id进行查询
     * @param id
     * @return
     */
     Dept findById(Long id);

    /**
     * 查询全部
     * @return
     */
     List<Dept> findAll();
}
