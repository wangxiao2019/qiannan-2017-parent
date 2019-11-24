package com.tedu.oop.basic;

public class Test1 {
    public static void main(String[] args)
    {
        Teacher t=new Teacher("张三","9527","讲师");
        Teacher t2=new Teacher("王二","2222","讲师","教育部门","英语",4);
        t.setname("李四");
        t2.sethours(3);
        t.ShowInfo();
        t2.ShowInfo();
    }

}
