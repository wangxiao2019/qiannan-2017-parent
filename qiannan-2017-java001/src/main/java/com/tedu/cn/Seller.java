package com.tedu.cn;

/**
 * 封装卖家属性和功能的类
 */
public class Seller extends User {
    /*卖家个性独有的属性*/
    int fans;
    double service;
    /*卖家个性独有的功能*/
    public void modifyOrder(){
        System.out.println(name+"修改订单......");
    }
    public void modifyProduct(){
        System.out.println(name+"修改商品......");
    }
}
