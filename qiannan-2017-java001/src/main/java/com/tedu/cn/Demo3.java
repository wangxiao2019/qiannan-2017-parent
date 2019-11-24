package com.tedu.cn;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * 数据类型分为两种：
 * 1，基本数据类型
 *    byte short int long double float boolean char
 * 2，引用数据类型
 *    除了基本数据类型以外其他的数据类型都是引用数据类型
 *    比如，类，数组等
 */
public class Demo3 {

    public static void main(String[] args) {
        /**
         * 第一种数据类型byte
         * byte的取值范围-128--->127
         * 内存中占8位
         */
        byte b1=123;
       // byte b2=138;编译错误，超出了byte的取值范围
        byte b2=126;
        byte b3=2;
        ///byte b4=b2+b3;编译错误，超出了byte的取值范围
        System.out.println(b1+":"+b2);

        /**
         * short类型：
         * short类型在实际的开发过程中不常使用
         * 取值范围在-32768--32767之间
         * 内存中  占16为
         */
        //short s1=32768; 编译错误，超出short的取值范围
        short s2=11;
        /**
         * int 类型：表示整形  Java语言中整形的字面量是
         * 整型
         * 取值范围大概在-21亿到21亿之间，内存中占32位
         */
        int i1=11;
        /**
         * long 类型：表示长整型，
         * 在内存里面占64位
         * 注意：由于整数的直接量是整型，所以
         * 需要通过后最的方式来取别一个数字
         * 是整形还是长整型，通过L或者l来取别。
         */
        long aa1=1L;

        /**
         * double类型：是双精度类型，java语言
         * 里面默认的浮点数的直接量就是double类型
         * 与之对应的一个浮点数的类型是float是一种
         * 单精度类型，区分double和float类型变量
         * 是通过后缀d和f来区分的,d表示double,f
         * 表示flaot
         * 可以使用科学计数法来表示double类型的变量
         */
        double d1=12.1;
        float f1=11.0f;  //float数据类型不常用
        /**
         * boolean 布尔类型
         * 取值只有两个：true  flase
         */
        boolean flag=true;
        boolean isTrue=false;
        /**
         * char类型：字符型
         * 只能赋值一个字符，而且这个字符必须使用单引号
         * 括起来
         * 计算机在存储的时候是以整形的方式存储的（unicode）
         */
        char gender='F';
        char tts='中';


    }
}
