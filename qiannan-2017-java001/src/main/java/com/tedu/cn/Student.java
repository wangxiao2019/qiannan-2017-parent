package com.tedu.cn;

public class Student {
    private String name;//全局变量
    int age;
    String sex;
    public Student(){//无参构造方法

    }
    public Student(String name,String sex,int age){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int setAge(){
        return age;
    }

    public String toString(){
        return"Student[名字："+name+" 年龄："+age+" 性别："+sex+"]";
    }
    public static String show(){
        return "";
    }
    public String show(String name){
        return "";


    }

}
