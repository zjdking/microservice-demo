package com.cn.microservicecloudapi.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zjdking
 * 2020/1/31 0031.
 * @version 1.0
 */
@Data
@Accessors(chain=true)
public class Dept implements Serializable {// 这个位置一定要序列化
    /**
     * 为什么要序列化？
     * 实体列在网上传输或者存储到缓存和磁盘的时候是通过二进制的 序列化是将实体类变成二进制；
     * 如果没有序列化，就会通过对象或者字符串进行存储，当我们使用这些数据的时候用是通过二进制去取，这样就会报错；
     */
    private Long deptno;
    private String dname;
    private String db_source;// 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库；同一个信息存储到不同数据库
}
