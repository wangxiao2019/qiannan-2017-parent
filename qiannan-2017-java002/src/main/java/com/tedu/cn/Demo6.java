package com.tedu.cn;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * @company: 贵州达内科技有限公司
 * @program 程序 = 数据结构 + 算法 (构成元素 + 运行机理)
 * @comment 达内教育专注于做技术人的指路明灯，
 * 职场生涯的精神导师
 * @date 2019/9/11 0011 10:52
 */
public class Demo6 {

    public static void main(String[] args) {
        String str="100+";
        int c=100;
        str=str+c;
        System.out.println(str);
        str="";
        System.out.println(str+c+c+c);
        System.out.println(c+c+c+str);
    }
}
