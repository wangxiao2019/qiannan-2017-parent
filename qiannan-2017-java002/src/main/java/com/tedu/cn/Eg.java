package com.tedu.cn;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Eg {

    public static void main(String[] args) {
        //1359567347
        int a, b, c;
        a = b = c = 100;
        System.out.println("a="+a+",b="+b+",c="+c);
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒").format(new Date())+" 作者：JackLei");
    }
}
