package com.tedu.cn;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * @company: 贵州达内科技有限公司
 * @program 程序 = 数据结构 + 算法 (构成元素 + 运行机理)
 * @comment 达内教育专注于做技术人的指路明灯，
 * 职场生涯的精神导师
 * @date 2019/9/11 0011 10:30
 */
public class Demo4 {

    public static void main(String[] args) {
        /**
         * 测试&&  ||  ！
         */
        int a=1;
        int b=2;
        int c=3;
        boolean f1=a>b&&b<c;
        System.out.println(f1);
        f1=a<b&&b<c;
        System.out.println(f1);
        f1=!f1;
        System.out.println(f1);
        //短路与
        boolean f2=a>b&&++b<c;
        System.out.println(f2);
        System.out.println(b);
    }
}
