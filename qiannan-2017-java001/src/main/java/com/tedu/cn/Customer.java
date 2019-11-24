package com.tedu.cn;

/**
 * 封装买家属性和功能的类
 */
public class Customer extends User {
    /*买家独有的属性*/
    int lvl;
    /*买家独有的功能*/
    public void evaluate(){
        System.out.println(name+"评价商品......");
    }

}
