package com.tedu.oop.basic;

/**
 * 封装建设银行ATM机的类
 * 所有的ATM机类都必须遵守银联的标准的接口
 * 所有的ATM机类都必须遵守银联的标准的接口中所有方法的定义
 * 编译错误：实现接口，实现接口就必须实现接口中所以的方法
 * 解决方法：add unimplemented methods
 */
public class ATMCBC implements IUnionPay,Ipolice{
    /**
     * 三个重写父类的方法
     * 实现类中除了定义接口方法外，还可以定义自己的成员变量和方法
     */
    public Card card;
    public void setCard(Card card){
        this.card=card;
    }
    //@Override:断言机制，告诉编译器当前是重写父类方法，请编译器写协助检查签名
        public boolean checkPwd( String input) {
        // 1、判断用户输入的input和card对象中pwd是否相同
            // 2、如果相同，则返回True
            // 3、字符串比较不能用==，必须用 equals方法
            if (input.equals(card.pwd)){
                return true;
            }else {
                return false;
            }
    }


    public boolean drawMoney(double money) {
        //先检查card对象中bal属性是否>=取款金额money
        //如果>=取款金额，则返回true
        //否则返回false
        if(card.bal>=money){
            card.bal-=money;
            return true;
        }else
            return false;
    }

    public double getBalance() {

        return card.bal;
    }

    public void takepic() {
        System.out.println("您已进入摄像区域...");
    }
}
