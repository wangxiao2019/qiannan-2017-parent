package com.tedu.cn;

import java.util.ArrayList;
import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        System.out.println("=========系统开始！=========");
        ArrayList<FruitItem> list=new ArrayList<FruitItem>();
    //调用商品初始化方法，传递集合
        init(list);
        while (true){
            //打印菜单
            mainMenu();
            //功能选择
            chooseFun(list);
        }
    }
    //商品初始化
    public static void init(ArrayList<FruitItem> list){
        FruitItem item1=new FruitItem();
        item1.ID=001;
        item1.name="柚子";
        item1.price=5.0;

        FruitItem item2=new FruitItem();
        item2.ID=002;
        item2.name="芒果";
        item2.price=8.8;

        FruitItem item3=new FruitItem();
        item3.ID=003;
        item3.name="橙子";
        item3.price=6.6;

        list.add(item1);
        list.add(item2);
        list.add(item3);
    }
    //打印菜单
    public static void mainMenu(){
        System.out.println("========欢迎光临超市========");
        System.out.println("1:查询货物 2:添加货物 3：删除货物 4:修改货物 5:退出");
    }
    //功能选择
    public static void chooseFun(ArrayList<FruitItem> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入您选择的功能：");
        int choose = sc.nextInt();

        switch (choose){
            case 1://库存查询
                showList(list);
                break;
            case 2://添加商品
                addList(list);
                break;
            case 3://删除商品
                delList(list);
                break;
            case 4://修改商品l
                editList(list);
                break;
            case 5://退出系统
                System.out.println("退出系统");
                return;
            default:
                System.out.println("对不起，没有您输入的功能，请重新选择");
                break;
        }
    }
    //库存查询
    public static void showList(ArrayList<FruitItem> list){
        System.out.println("=============商品库存清单=============");
        System.out.println("商品编号\t商品名称\t商品单价");
        for (int i=0;i<list.size();i++){
            FruitItem item=list.get(i);
            System.out.println(item.ID+"\t\t"+item.name+"\t\t"+item.price);
        }
    }
    //添加库存
    public static void addList(ArrayList<FruitItem> list){
        FruitItem item=new FruitItem();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品编号：");
        item.ID = sc.nextInt();
        System.out.println("请输入商品名称：");
        item.name = sc.next();
        System.out.println("请输入商品价格：");
        item.price = sc.nextDouble();
        list.add(item);
    }
    //删除商品
    public static void delList(ArrayList<FruitItem> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的商品的编号");
        int num=sc.nextInt();
        for (int i=0;i<list.size();i++){
            FruitItem item=list.get(i);
            if (item.ID == num){
                list.remove(item);
                return;
            }
        }
        System.out.println("对不起，没有这个编号的商品。");
    }
    //修改商品
    public static void editList(ArrayList<FruitItem> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的编号：");
        int num = sc.nextInt();
        for (int i = 0;i<list.size();i++){
            FruitItem item = list.get(i);
            if (item.ID == num){
                System.out.println("请输入新的商品ID:");
                item.ID = sc.nextInt();
                System.out.println("请输入新的商品名称：");
                item.name = sc.next();
                System.out.println("请输入新的商品价格：");
                item.price = sc.nextDouble();
                System.out.println("商品信息更新完毕！");
                return;
            }
        }
        System.out.println("对不起，没有这个编号的商品。");
    }
}
