package com.tedu.cn;
/*
请通过代码封装，实现如下需求：
编写一个类Book，代表教材:
具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
为各属性设置赋值和取值方法
具有方法:detail，用来在控制台输出每本教材的名称和页数
编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
*/

class Book{
    //设置两个私有成员变量
    //并设置setter和getter访问器
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        //设置限制条件
        //页数不能少于200页，否则输出错误信息，并赋予默认值200
        if(pageNum>=200) {
            this.pageNum = pageNum;
        }else {
            System.err.println("页数不能少于200页");
            this.pageNum =200;
        }
    }
    //方法:detail，用来在控制台输出每本教材的名称和页数
    public void detail() {
        System.out.println("教材名称:"+this.title);
        System.out.println("教材页数:"+this.pageNum+"页");
    }


}












