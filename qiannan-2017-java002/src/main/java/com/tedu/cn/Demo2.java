package com.tedu.cn;

/**
 * Java基础：
 *   面向对象
 *   面向接口和抽象类
 * JavaSe
 *    常用的API
 *    Java流
 *    文件处理
 *    多线程
 *    网络编程
 *    JDBC（良好的mysql数据库基础）
 * 分类学习：
 *    Java企业级应用
 *       html+div+css3布局
 *       bootstrap布局
 *       JavaScript(js)
 *       jquery.js
 *       vue.js
 *       ajax技术
 *     servlet+jsp技术
 *     servet+前端技术(jsp)+mysql实现图书馆管管理系统
 *     spring IOC  和 AOP（面向曲面）
 *     springMVC(传递数据处理客服端请求)
 *     mybatis（连接数据库的持久层框架）
 *     SSM整合实现图书馆管理系统
 *      rabbitMQ（消息队列）
 *      kafaka  (日志处理)
 *      redis
 *      做分布式电商项目再本地主机实现（再windos平台运行）
 *      上线：
 *      linux操作系统熟悉shell编程
 *      熟悉使用nginx+tomcat实现反向代理和负载均衡以及动态分离
 *      项目部署打包：  6k
 *
 *      想要6k+
 *      微服务技术：
 *      springboot技术
 *      springcloud技术
 *
 *    移动开发
 *    Java大数据
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 测试++ 与--运算符
         */
       int a=1;
       int b=3;
       int c=5;
        System.out.println(++c+a+a++);
        System.out.println(a);
        System.out.println(c);
        /**
         * 特别注意：++分为前++和后++
         * 当它们分别使用在表达式里面的时候，
         * 如果是前++那么会参与表达式的计算也就是
         * 先将自己自增，然后再运算；如果是后++
         * 则先参与表达式的计算算出表达式的值之后
         *再将自己自增
         */
        int d=4;
        int e=3;
        int f=2;
        ++d;
        d++;
        e++;
        ++e;
        ++f;
        f++;
        System.out.println(d+":"+e+":"+f);
        int g=++e+(--d)+(--f)+(++d)+e--;
        System.out.println(d+":"+e+":"+f);
        System.out.println(g);


    }
}
