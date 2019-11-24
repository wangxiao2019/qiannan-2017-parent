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
 * @date 2019/9/11 0011 14:10
 */
public class Demo8 {
    public static void main(String[] args) {
        //获取扫描器对象
        Scanner scanner=new Scanner(System.in);
        //提示用户输入商品单价
        System.out.println("请输入商品单价");
        double price=scanner.nextDouble();//等待用户输入double类型的值
        //提示用户输入商品数量
        System.out.println("请输入商品数量");
        int count=scanner.nextInt();
        double total=count*price;
        if(total>=500){
            total*=0.8;
            System.out.println("已经享受了8折优惠");
        }else{
            System.out.println("不符合优惠条件，不享受打折");
        }
        System.out.println("您的应付金额为："+total);
        System.out.println("请扫码支付");
        double payment=scanner.nextDouble();
        if(payment<total){
            System.out.println("交易失败，余额不足");
        }
        //关闭流
        scanner.close();
    }

}
