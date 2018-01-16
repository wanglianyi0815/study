package com.test.algorithm.sorting;

/**
 * 3、选择排序-->简单排序
 * 基本思想：
 * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
 * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 * Created by wanglianyi on 2017/4/26 0026.
 */
public class SimpleSelectSort {

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        SimpleSelectSort  obj=new SimpleSelectSort();
        System.out.println("初始值：");
        obj.print(a);
        obj.selectSort(a);
        System.out.println("\n排序后：");
        obj.print(a);

    }
    private void selectSort(int[] a) {
        for(int i=0;i<a.length;i++){
            int k=i;//k存放最小值下标。每次循环最小值下标+1
            for(int j=i+1;j<a.length;j++){//找到最小值下标
                if(a[k]>a[j])
                    k=j;
            }
            swap(a,k,i);//把最小值放到它该放的位置上
        }
    }

    public void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public  void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
