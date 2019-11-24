package com.tedu.cn;

public class TransferProperty {
    int i=47;
    public void call(){
        System.out.println("调用call()方法");
        for (i=0;i<3;i++){
            System.out.println(i+"");
            if (i==2){
                System.out.println("\n");
            }
        }
    }
}
