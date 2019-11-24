package com.tedu.cn;
public class Homework {

    public static void main(String[] args) {
        /**
         * 需求：
         * 计算某一段程序的运行时间
         * Java提供了一个API叫做
         *System.nanoTime();获取1970年到现在系统时间的纳秒数
         * System.currentTimeMillis(); 获取1970年到现在系统时间的毫秒数
         */
        //获取程序运行之前的系统时间戳
        long start=System.nanoTime();
        System.out.println("你好");
        System.out.println("你好");
        System.out.println("你好");
        long end=System.nanoTime();
        System.out.println("程序的运行时间是："+(end-start));
    }
}
