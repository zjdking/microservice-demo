学习很重要，总结可以让你记得更牢
对于spring cloud 组件引入1.pom 坐标；2.主启动类上边的注解；还有对应该组件的注解；
什么是微服务？
    微服务架构是微服务的一种落地思想； 皇帝说减税，大臣根据这个思想去减免税务
    是一种架构模式，将单一应用划分成一组小的应用；小而独立的进程；
优缺点？ 项目开发中遇到的坑；
    按照纬度；
分布式系统面临的问题？

cloud 和 dubbo 的区别？
    按照纬度
rest 和 rpc 对比？
SOA ?
    面向服务的架构，将业务功能设计成一个个的服务
CAP 理论？
1. Eureka
    主要负责服务的注册和发现  CS架构
    1.1 自我保护？
    1.2 eureka和zookeeper区别


2. ribbon
    负载均衡  ribbon+restTemplete  他是可以自定义负载均衡
3. feign
    内置ribbon 的负载均衡
    3.1 feign ribbon nginx 三者区别

4. hystrix 豪猪
    熔断，降级，限流
5. zuul
    路由 对内部服务进行保护作用
    代理+路由+过滤
6. config
    同一的配置中心，CS架构； client-->server-->github


