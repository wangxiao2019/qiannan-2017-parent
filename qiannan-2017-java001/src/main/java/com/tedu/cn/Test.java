package com.tedu.cn;

public class Test {
    public static void main(String[] args) {
        User u = new User();
        Customer c = new Customer();
        Seller s = new Seller();
        c.name="白富美";
        s.name="店小二";
        c.searchOrders();
        s.searchProducts();
        IPad air2 = new IPad(7.1,7850);
        System.out.println("屏幕："+air2.screen+"; 电池："+air2.battery);
        IPhone if6 = new IPhone(4.7,6540,12312356);
        System.out.println("屏幕："+if6.screen+"; " +
                "电池："+if6.battery+"；" +
                " 电话："+if6.mobile);
        /*向上转型的测试*/
        IPad charger;
        charger = air2; //编译正确，air2本身就是IPad类型
        charger = if6; //编译正确，if6时继承IPad的方法
        charger(charger);
        charger(air2);
   }
   public static void charger(IPad charger){
       System.out.println(charger.toString()+"正在充电...");
   }
}
class IPad{
    double screen;//屏幕大小
    int battery;//电池大小
    //编译器自动生成
    IPad(){

    }

    public IPad(double screen, int battery) {
        this.screen = screen;
        this.battery = battery;
    }
}
class IPhone extends IPad{
    int mobile;//手机号
    //编译器自动生成
   /* IPhone(){
        super();
        this.mobile=123456;
    }*/

    public IPhone(double screen, int battery, int mobile) {
        super(screen, battery);
        this.mobile = mobile;
    }
}
