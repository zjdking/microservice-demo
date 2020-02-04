package com.cn.microservicecloudapi.service;

import com.cn.microservicecloudapi.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zjdking
 * 2020/2/3 0003.
 * @version 1.0
 */
@Component  // 一定不要忘记添加到容器中，否则FeignClient获取不到；
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientServcie> {
    @Override
    public DeptClientServcie create(Throwable throwable) {
        return new DeptClientServcie() {
            @Override
            public Dept get(long id)
            {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
