package com.tedu.oop.basic;

public class ATMABC extends ATMCBC implements IABC{
    @Override
    public boolean drawMoney(double money){
        //如果余额 - 取款金额>=-2000，说明在可透支范围内
        //  就正常从银行卡中扣款，斌返回true
        //  否则返回false
        if ((card.bal-money)>=-2000){
            card.bal-=money;
            return true;
        }else {
            return  false;
        }
    }
    public boolean payTellBill(String tel, double money) {
        //验证号码的长度是11位，则可以充值
        //调用当前的取款方法，取出指定话费
        //如果取款成功则返回true,否则返回false
        if (tel.length()==11){
            if (drawMoney(money)){
                System.out.println("为"+tel+"号码充值"+money+"成功");
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }


}
