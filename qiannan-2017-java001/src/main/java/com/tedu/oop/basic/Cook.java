package com.tedu.oop.basic;

/**
 * 封装厨师属性和功能的类
 */
public abstract class Cook {
    public String name;//厨师的姓名

    /**
     * 厨师类型的带参构造方法
     * @param name 厨师得姓名
     */
    public Cook(String name) {
        super();
        this.name = name;
    }

    /**
     * 仅要求厨师必须能够做菜
     * 具体做什么菜，需要根据实现类得具体方法实现决定
     */
    public abstract void cook();
}

