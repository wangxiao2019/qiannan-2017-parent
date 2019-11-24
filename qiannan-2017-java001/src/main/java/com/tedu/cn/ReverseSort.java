package com.tedu.cn;

public class ReverseSort {
    public static void main(String[] args) {
        int[] array={12,15,4,23,56,42};
        ReverseSort sorter=new ReverseSort();
        sorter.sort(array);
    }
    public void sort(int[] array){
        System.out.println("数组原内容：");
        showArray(array);
        int temp;
        int len=array.length;
        for (int i=0;i<len/2;i++){
            temp=array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=temp;
        }
        System.out.println("数组反转后内容：");
        showArray(array);
    }
    public void showArray(int[] array){
        for (int i:array){
            System.out.println("\t"+i);
        }
        System.out.println();
    }
}
