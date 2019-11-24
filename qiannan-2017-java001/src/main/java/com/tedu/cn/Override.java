package com.tedu.cn;
import com.tedu.cn.Child1;
public class Override {
    public static void main(String[] args) {
        double fell = 480;//实际学费
        double money = 500;//家长给的钱
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        //家长的做法要求
        p.pay(money,fell);
        //大儿子的做法
        c1.pay(money,fell);
        c1.play();
        //小儿子的做法
        c2.pay(money,fell);
        /*动态调用的方法*/
        Parent dad = new Parent();
        Child1 son1 = new Child1();
        Child2 son2 = new Child2();
        dad = son1;//爸爸给大儿子做蛋炒饭
        son1.cook();
        dad = son2;//爸爸给小儿子包饺子
        son2.cook();
        dad = new Parent();//只有父类型变量才能调用父类型方法
        dad.cook();




    }
}

/**
 * 封装家长的类
 */
class Parent{
    /**
     * 爸爸的任务
     */

    public void cook(){
        System.out.println("爸爸的任务是：做饭");
    }
    /**
     * 交学费的方法
     * @param money 找家长要了多少钱
     * @param fell 实际交学费的钱
     */
    public void pay(double money,double fell){
        System.out.println("家长让交"+fell+"做学费,剩下的"+(money-fell)+"作为零花钱");
    }
}

/**
 * 封装大儿子的类
 */
class Child1 extends Parent{
    //大儿子抽到的任务卡
    public void cook(){

        System.out.println("帮大儿子做蛋炒饭");
    }
    public void play(){
        System.out.println("特别喜欢玩");
    }

    /**
     * 大儿子重写交学费的方法
     * @param money 找家长要了多少钱
     * @param fell 实际交学费的钱
     */
    public void pay(double money,double fell){
        System.out.println("没交学费的，都买了"+money+"元的变形金刚");
    }
}

/**
 * 封装小儿子的类
 */
class Child2 extends Parent{
    /*重写父类的方法*/

    /**
     * 小儿子领到的任务卡
     */
    public void cook(){

        System.out.println("帮小儿子包饺子");
    }
    public void pay(double money,double fell){
        //使用在子类实例方法中，可以使用super.方法名的形式
        //在构造器里面，表示调用父类的构造器初始化当前创建的对象
       super.pay(money,fell);

        System.out.println("给爸爸当零花钱");
    }
}