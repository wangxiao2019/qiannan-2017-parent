package com.tedu.cn;

import java.util.Random;
import java.util.Scanner;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * @company: 贵州达内科技有限公司
 * @program 程序 = 数据结构 + 算法 (构成元素 + 运行机理)
 * @comment 达内教育专注于做技术人的指路明灯，
 * 职场生涯的精神导师
 * @date 2019/9/18 0018 10:23
 */
public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的答案");
        int answer=scanner.nextInt();
        //系统随机生成一个整数（1--100）
        Random random=new Random();
        int sys_number=random.nextInt(101); //生成0-100的随机数

          do{
              if(answer<sys_number){
                  System.out.println("小了");
                  System.out.println("继续猜猜我是谁");
                  answer=scanner.nextInt();
              }
              if(answer>sys_number){
                  System.out.println("大了");
                  System.out.println("继续猜猜我是谁");
                  answer=scanner.nextInt();
              }
              if(answer==sys_number){
                  System.out.println("恭喜您猜对了！");
              }
          }while (answer!=sys_number);
          scanner.close();
    }
}
