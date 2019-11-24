package com.tedu.cn;
public class SelectSort {
    //直接排序
    public static void main(String[] args) {
        int[] array={12,15,14,2,68,13};
        SelectSort sorter=new SelectSort();
        sorter.sort(array);

    }
    public void sort(int[] array){
        int index;
        for (int i=1;i<array.length;i++){
            index=0;
            for (int j=1;j<=array.length-i;j++){
                if (array[j]>array[index]){
                    index=j;
                }
            }
            int temp=array[array.length-i];
            array[array.length-i]=array[index];
            array[index]=temp;
        }
        showArray(array);
    }
    public void showArray(int[] array){
        for (int i:array){
            System.out.println("<"+i);
        }
        System.out.println();
    }
}
