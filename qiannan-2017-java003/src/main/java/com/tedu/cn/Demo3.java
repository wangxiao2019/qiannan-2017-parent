package com.tedu.cn;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.portable.Streamable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Demo3 {
    @Test
    public void test1(){
        int week=7;
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
                break;
            case 3:
                System.out.println("Wednesdday");
                break;
            default:
                System.out.println("sory,I don't know");

        }
    }
    @Test
    public void test2(){
        int x=1;
        int sum=0;
        while(x<=10){
            sum=sum+x;
            x++;
        }
        System.out.println("sum="+sum);
    }
    @Test
    public void test3(){
        int a=100;
        while (a==60)
        {
            System.out.println("ok1");
            a--;
        }
        int b=100;
        do{
            System.out.println("ok2");
            b--;
        }while (b==60);
    }
    @Test
    public void test4(){
        int sum=0;
        for (int i=1;i<=100;i+=2){
            sum=sum+i;
        }
        System.out.println("2到100之间所有奇数之和为："+sum);
    }
    @Test
    public void test6(){
        for (int i=0;i<3;i++){
            for (int j=0;j<6;j++){
                if (j==4){
                    break;
                }
                System.out.println("i="+i+"j="+j);
            }
        }
    }
    @Test
    public void test7(){
        String str="we are student";
        int size=str.lastIndexOf("");
        System.out.println("空字符在字符串中的索引位置是："+size);
        System.out.println("字符串str的长度是："+str.length());
    }
    @Test
    public void test8(){
        String str="hello word";
        char mychar=str.charAt(6);
        System.out.println("字符串str中索引位置是6的字符为："+mychar);
    }
    @Test
    public void test9(){
        String str="hello word";
        String substr=str.substring(0,3);
        System.out.println(substr);
    }
    @Test
    public void test10(){
        String str=" Java class ";
        System.out.println("字符串原来的长度："+str.length());
        System.out.println("去掉空格后的长度："+str.trim().length());
    }
    @Test
    public void test11(){
        String str="address";
        String newstr=str.replace("a","A");
        System.out.println(newstr);
    }
    @Test
    public void test(){
        String num1="220201212";
        String num2="214588878";
        boolean b=num1.startsWith("22");
        boolean b2=num1.endsWith("78");
        boolean b3=num2.startsWith("22");
        boolean b4=num2.endsWith("78");
        System.out.println("字符串num1是以'22'开始的吗？"+b);
        System.out.println("字符串num1是以'78'结束的吗？"+b2);
        System.out.println("字符串num2是以'22'开始的吗？"+b3);
        System.out.println("字符串num2是以'78'结束的吗？"+b4);
    }
    @Test
    public void test12(){
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                continue;
            }
            System.out.print("i=" + i +" ");
        }
    }
    @Test
    public void test13(){
        String s1=new String("abc");
        String s2=new String("ABC");
        String s3=new String("abc");
        boolean b=s1.equals(s2);
        boolean b2=s1.equalsIgnoreCase(s2);
        System.out.println(s1+"equals"+s2+":"+b);
        System.out.println(s1+"equalslgnoreCase"+s2+":"+b2);
    }
    @Test
    public void test14(){
        String str=new String("b");
        String str2=new String("a");
        String str3=new String("c");
        System.out.println(str+"compareTo"+str2+":" +str.compareTo(str2));
        System.out.println(str+"compareTo"+str3+":" +str.compareTo(str3));
    }
    @Test
    public void test15(){
        String str=new String("abc DEF");
        String newstr=str.toLowerCase();
        String newstr2=str.toUpperCase();
        System.out.println(newstr);
        System.out.println(newstr2);

    }
    @Test
    public void test16(){
        String str="192.168.0.1";
        String[]firstArray=str.split("\\.");
        String[]secondArray=str.split("\\.",2);
        System.out.println("str的原值为：["+str+"]");
        System.out.println("全部分割的结果：");
        for (String a:firstArray){
            System.out.println("["+a+"]");
        }
         System.out.println();
        //输出两次分割的结果
        System.out.println("分割两次的结果：");
        for (String a:secondArray){
            System.out.println("["+a+"]");
        }
        System.out.println();
    }
    @Test
    public void test17(){
        Date date=new Date();
        String year=String.format("%tY",date);
        String month=String.format("%tB",date);
        String day=String.format("%td",date);
        System.out.println("今年是："+year+"年");
        System.out.println("现在是："+month);
        System.out.println("今天是："+day+"号");
    }
    @Test
    public void test18(){
        Date date=new Date();
        String hour=String.format("%tH",date);
                String minute=String.format("%tM",date);
        String second=String.format("%tS",date);
        System.out.println("现在是："+hour+"时"+minute+"分"+second+"秒");


    }
    @Test
    public void test19(){
        Date date=new Date();
        String time=String.format("%tc",date);
        String form=String.format("tF",date);
        System.out.println("全部的时间信息是："+time);
        System.out.println("念-月-日格式："+form);
    }
    @Test
    public void test20(){
        String str=String.format("%d",400/2);
        String str2=String.format("%b",3>5);
        String str3=String.format("%x",200);
        System.out.println("400的一半是："+str);
        System.out.println("3>5正确吗："+str2);
        System.out.println("200的十六进制数是："+str3);
    }
    @Test
    public void test21(){
        String str="";
        long starTime=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            str=str+i;
        }
        long endTime=System.currentTimeMillis();
        long time=endTime+-starTime;
        System.out.print("String 消耗时间："+time);
        StringBuilder builder=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for (int j=0;j<10000;j++){
            builder.append(j);
        }
        endTime=System.currentTimeMillis();
        time=endTime-starTime;
        System.out.println("StringBuilder 消耗时间："+time);
    }
    @Test
    public void test22(){
        int a[][]=new int[3][4];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
    @Test
    public void test23(){
        int a[][]=new int[3][4];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
    @Test
    public void test24(){
        int b[][]=new int[][]{{1},{2,3},{4,5,6}};
        for (int k=0;k<b.length;k++){
            for (int c=0;c<b[k].length;c++){
                System.out.println(b[k][c]);
            }
            System.out.println();
        }
    }
    @Test
    public void test25(){
        int arr2[][]={{4,3},{1,2}};
        System.out.println("数组中的元素是：");
        int i=0;
        for (int x[]:arr2){
            i++;
            int j=0;
            for (int e:x){
                j++;
                if (i==arr2.length&&j==x.length){
                    System.out.println(e);
                }else
                    System.out.println(e+"、");
            }
        }
    }
    @Test
    public void test26(){
      int arr[]=new int[5];
        Arrays.fill(arr,8);
        for (int i=0;i<arr.length;i++){
            System.out.println("第"+i+"个元素是："+arr[i]);
        }

    }
    @Test
    public void test27(){
        int arr[]=new int[]{45,13,2,11};
        Arrays.fill(arr,1,2,9);
        for (int i=0;i<arr.length;i++){
            System.out.println("第"+i+"个元素是："+arr[i]);
        }
    }
    @Test
    public void test28(){
        int arr[]=new int[]{12,1,36,8,9};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
