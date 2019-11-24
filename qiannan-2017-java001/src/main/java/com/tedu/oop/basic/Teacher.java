package com.tedu.oop.basic;

public class Teacher {
    private String name;
    private String num;
    private String prof;
    private String dept;
    private String course;
    private int hours;
    public Teacher(String name,String num,String prof){
        this.name=name;
        this.num=num;
        this.prof=prof;
    }
    public Teacher(String name,String num,String prof,String dept,String course,int hours){
        this.name=name;
        this.num=num;
        this.prof=prof;
        this.dept=dept;
        this.course=course;
        this.hours=hours;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setnum(String num){
        this.num=num;
    }
    public void setprof(String prof){
        this.prof=prof;
    }
    public void setdept(String dept){
        this.dept=dept;
    }
    public void setcourse(String course){
        this.course=course;
    }
    public void sethours(int hours){
        this.hours=hours;
    }
    public String getname(){
        return name;
    }
    public String getnum(){
        return num;
    }
    public String getprof(){
        return prof;
    }
    public String getdept(){
        return dept;
    }
    public String getcourse(){
        return course;
    }
    public int gethours(){
        return hours;
    }
    public void ShowInfo(){
        System.out.println("姓名："+name);
        System.out.println("工号："+num);
        System.out.println("职称："+prof);
        System.out.println("部门"+dept);
        System.out.println("课程"+course);
        System.out.println("每周课时数："+hours);
    }
}


