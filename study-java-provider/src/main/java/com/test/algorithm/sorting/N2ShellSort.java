package com.test.algorithm.sorting;

/**
 * 2、插入排序-->希尔排序
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
 * 操作方法：
 * 1、选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 2、按增量序列个数k，对序列进行k 趟排序；
 * 3、每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 * Created by wanglianyi on 2017/4/26 0026.
 */
public class N2ShellSort {
    /**
     * 算法实现:
     * 我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
     * 即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.
     * 对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
     * 继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
     */
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        N2ShellSort obj = new N2ShellSort();
        System.out.println("初始值：");
        obj.print(a);
        obj.shellSort(a);
        System.out.println("\n排序后：");
        obj.print(a);

    }

    private void shellSort(int[] a) {
        int dk = a.length / 2;
        while (dk >= 1) {
            ShellInsertSort(a, dk);
            dk = dk / 2;
        }
    }

    //类似插入排序，只是插入排序增量是1，这里增量是dk,把1换成dk就可以了
    private void ShellInsertSort(int[] a, int dk) {
        for (int i = dk; i < a.length; i++) {
            int j=i-dk;
            if (a[i] < a[j]) {
                int x = a[i];//x为待插入元素
                a[i] = a[j];
                a[j]=x;
            }
        }
    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
