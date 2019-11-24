package com.tedu.oop.basic;

public class Employee {
    //定义成员变量
    private String empId;
    private String name;
    private int age;
    //定义构造方法
    public Employee() {	}
    //定义成员方法set，get方法
    public String getEmpId(){
        return empId;
    }
    public void setEmpId(String empId){
        this.empId=empId;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //定义成员方法show方法
    public void show(){
        System.out.println("员工编号是："+getEmpId()+"\t姓名是："+getName()+"\t年龄："+getAge());
    }


}
