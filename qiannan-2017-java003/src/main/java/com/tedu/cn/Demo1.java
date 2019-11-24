package com.tedu.cn;

import org.junit.Test;

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
 * @date 2019/9/18 0018 8:24
 */
public class Demo1 {

    /**
     * junit是一款单元测试工具
     */
    @Test
    public void test1(){
        System.out.println("*************");
    }

    /**
     * 循环的类型：
     *  while(条件表达式){
     *
     *      语句块
     *  }
     *  执行流程：当表达式的值为true的时候执行语句块，然后在回去判断
     *  表达式的值是否为true,如果是则继续执行语句块，直到表达式的值为
     *  false为止才结束循环
     *
     *  do{
     *      语句块
     *  }while(条件表达式);
     *
     *  执行流程:先执行一次语句块，然后再判断表达式的值，如果为true，则继续执行
     *  语句块，直到表达式为false为止结束循环
     *
     *  do--while和while循环的区别
     *  对于while循环来说，直接判断表达式的值，如果表达式的值为true，执行循环体，直到表达式的
     *  值为fa'l'se 为止结束循环
     *  do--while循环则至少执行语句块一次，然后去判单条件表达式的值，决定是否再
     *  继续下一次循环。
     *
     *  for循环：
     *  结构：
     *  for(表达式1;表达式2;表达式3;){
     *       语句块；
     *  }
     *  流程：
     *  1、先执行表达式1。
     *  2、执行表达式2 如果表达式2执行的结构是true，执行语句块
     *  然后执行表达式3，再执行表达式2，如果为true,则继续执行语句块
     *  直到表达式2的值为false为止
     *  其中表达式1只执行了1次
     *
     *
     */
    /**
     * 输出100次hello
     */
    @Test
    public void testFor(){
        for (int i = 1; i <=100 ; i++ ) {
            System.out.println("hello");

        }
    }
    /**
     * 测试for循环的特殊用法
     */
    @Test
    public void testFor01(){
        /*int i = 0;
        for (; i <100 ; ) {
            i++;
        }*/
        /*for(;;){
        死循环
        }*/
       /* for(表达式1;表达式2;表达式3;){
           语句块；
     }*/
        /**
         * 表达式1，和表达式3可以添加多个表达式，多个
         * 表达式之间使用,号隔开，表达式2只能有一个
         */
        for (int i = 0,j=1,k=0; i <10 ; i++,j++,++k) {
            System.out.println(i+":"+j+":"+k);
        }
    }

    /**
     * 练习：控制台输出1--100的和
     */
    @Test
    public void testWhile01(){
        int count=0;
       while (count<100){
           System.out.println("hello 第"+(count+1)+"次");
           ++count;
       }
    }
    /**
     * continue和break关键字在循环中的运用
     * continue用户结束本次的循环继续判断循环条件是否
     * 要执行下一次循环
     * break:表示跳出整个循环使整个循环结束
     */
    @Test
    public void testContinuInFor(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("外层循环第"+i+"次");
            for (int j = 1; j <=10 ; j++) {
            System.out.println(j);
            System.out.println("内层循环第"+j+"次");
        }
    }
        /**
         * 注意：如果出现循环里面套循环（循环嵌套）
         * 外层循环执行一次，内层循环执行多次
         */
    }
    /**
     * 控制台输入一个整数，求1到该整数的和
     * 注意：对于循环问题一定要关注：
     * 循环的初始变量的状态
     * 循环条件
     * 循环变量的改变
     */
    @Test
    public void testMath(){
        int r=(int)Math.pow(10,2)-1;
        System.out.println(r);
    }
    @Test
    public void test999(){
      long sum=0L;
      String rs="";

        for (int i = 1; i <=10 ; i++) {
            long tmp= (long) (Math.pow(10,i)-1);
            sum+=tmp;
             if(i==4){
                 rs+="...";
             }else if(i<=3){
                 rs+=tmp+"+";
             }else if (i<=9){
                 continue;
             }
            if(i==10){
                rs+="+"+tmp+"="+sum;
            }
        }
        System.out.println(rs);
    }
    @Test
    public void testWhile02(){

        //System.out.println("请输入一个整数");
        int in=100;//用户输入的值  ，控制循环的次数
        int count=1;  //该变量是循环的初始值
        int sum=0;  //该变量存放累加的和
        while (count<=in){
            sum+=count;
            ++count;
        }
        System.out.println("最后的求和值是："+sum);

    }
    /**
     * 简单版的猜字符游戏：
     * 用户输入一个整数，程序随机生成一个整数（一定范围内），如果猜大了，就提示
     * 大了，小了就提示小了，直到猜对为止
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的答案");
        int answer=scanner.nextInt();
        //系统随机生成一个整数（1--100）
        Random random=new Random();
        int sys_number=random.nextInt(101); //生成0-100的随机数
       /* if(answer==sys_number){
            System.out.println("恭喜您猜对了");
        }
        while(answer!=sys_number){
            if(answer>sys_number){
                System.out.println("您猜的有点大");
                System.out.println("请输入您的答案");
                answer=scanner.nextInt();
            }
            if(answer<sys_number){
                System.out.println("您猜的有点小");
                System.out.println("请输入您的答案");
                answer=scanner.nextInt();
            }
            if(answer==sys_number){
                System.out.println("恭喜您猜对了");
            }
        }*/
        scanner.close();
    }


    /**
     *
     */

}
