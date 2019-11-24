package com.tedu.oop.basic;

import java.util.Scanner;

public class InterfaceTest {
    public static void main(String[] args) {
        //实例化对象取款机ATM机
       // ATMABC atm = new ATMABC();
        //使用接口类型变量，引用实现类的对象
        IUnionPay atm ;
        //实例化一张银行卡
        Card card = new Card(IUnionPay.CBC, "123456", 5000);
        /* 动态实例化对象*/
        if (card.bank.equals(IUnionPay.CBC)){
            atm = new ATMCBC();
        }else if(card.bank.equals(IUnionPay.ABC)){
            atm = new ATMABC();
        }else{
            System.out.println("不支持的银行卡");
            return;
        }
        //将银行卡放入取款机
        atm.setCard(card);
        //先拍照,在操作
        atm.takepic();
        //编译错误：父类型只能调用子类型中重写的方法
        //          父类型不能调用子类型中非重写的方法
        //提示用户输入密码，获得用户输入的密码，将密码保存在input中
        System.out.println("请用户输入密码：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //step5:调用ATM对象机的验证密码方法
        // 如果验证通过
        // 就提示用户输入 取款金额，斌保存到变量money中
        // 调用ATM机的取款方法，判断取款结果
        // 如果判断成功，则提示卡内余额
        //否则提示余额不足，取款失败
        //  否则提示密码输入错误
        if (atm.checkPwd(input)) {

            System.out.println("输入取款金额");
            double money = sc.nextDouble();
            if (atm.drawMoney(money)){
                System.out.println("取款成功，余额为："+atm.getBalance());
            }else {
                System.out.println("余额不足，取款失败");
            }
        } else {
            System.out.println("密码验证失败，退出！");
        }
    }
}
