package com.tedu.cn;

public class User {
    /*公共属性*/
    String name;
    String address;
    String mobile;
    /*公共的功能*/
    public void searchProducts(){
        System.out.println(name+"查询商品......");
    }
    public void searchOrders(){
        System.out.println(name+"查询订单......");
    }
}


