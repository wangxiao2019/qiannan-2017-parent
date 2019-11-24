package com.tedu.cn;

/**
 * @phone:13595672347
 * @qq:1441826270
 * @作者：雷玉荣
 * @company: 贵州达内科技有限公司
 * @program 程序 = 数据结构 + 算法 (构成元素 + 运行机理)
 * @comment 达内教育专注于做技术人的指路明灯，
 * 职场生涯的精神导师
 * @date 2019/9/4 0004 9:11
 */
public class Demo1 {

    public static void main(String []args){
        //int 3ab=1;变量名不能以数字开头
        int score=100;
        int $ha=12;
        //int public=1; 变量名不能是Java语言里面的关键字
        /**
         * 驼峰命名：
         * 如果一个变量由多个单词组成，那么除了第一个
         * 单词之外其他单词的首字母必须大写
         */
        int studentScore=20;
        //int afasdfadsklf=13;变量必须符合见名知意

        System.out.println(studentScore);
        //System.out.println(xx);变量必须先申明后使用
        int sum=1;
        sum=100;
        System.out.println(sum+1);
        int Sum=12;
        int 中国=1;  //不推荐使用中文命名一个变量
        int number=1111111111;
        int c=0xafff;
        /**
         * 1111  1111 1111 1111
         *
         *            32768 16384 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
         */
        int d=0777;
        /**
         * 111  111 111
         *     256  128 64    32 16 8  4 2 1
         */
        System.out.println(d);
    }

}
