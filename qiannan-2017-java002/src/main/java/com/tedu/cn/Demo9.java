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
 * @date 2019/9/11 0011 15:02
 */
public class Demo9 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入分数");
        double score=scanner.nextDouble();
        if(score>=90){
            System.out.println("A");
        }else if(score>=70){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
        scanner.close();
    }

}
