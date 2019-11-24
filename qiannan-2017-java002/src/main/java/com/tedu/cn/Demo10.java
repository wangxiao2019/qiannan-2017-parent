package com.tedu.cn;

import java.util.Scanner;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * @company: 贵州达内科技有限公司
 * @program 程序 = 数据结构 + 算法 (构成元素 + 运行机理)
 * @comment 达内教育专注于做技术人的指路明灯，
 * 职场生涯的精神导师
 * @date 2019/9/11 0011 15:07
 */
public class Demo10 {
    public static void main(String[] args) {
        /**
         * 使用switch的效率高于if-else if()
         * 结构
         * switch（表达式）表达式的
         * 值只能为 整形，字符型，字符串类型（JDK1.7）
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        boolean isLeapYear=year%4==0&&year%100!=0||year%400==0;
        System.out.println("请输入判断的月份");
        int month=scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("31天");
                break;
            case 2:
                if(isLeapYear){
                    System.out.println("29天");
                }else{
                    System.out.println("28天");
                }
                break;
            case 3:
                System.out.println("31天");
                break;
            case 4:
                System.out.println("30天");
                break;
            case 5:
                System.out.println("31天");
                break;
            case 6:
                System.out.println("30天");
                break;
            case 7:
                System.out.println("31天");
                break;
            case 8:
                System.out.println("31天");
                break;
            case 9:
                System.out.println("30天");
                break;
            case 10:
                System.out.println("31天");
                break;
            case 11:
                System.out.println("30天");
                break;
            case 12:
                System.out.println("31天");
                break;
              default:{
                  System.out.println("输入非法");
              }

        }
        scanner.close();
    }
}
