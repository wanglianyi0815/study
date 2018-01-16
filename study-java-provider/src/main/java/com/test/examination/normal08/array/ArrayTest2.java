package com.test.examination.normal08.array;

import java.util.Arrays;

/**
 * 数组是一个对象，比较的是内存地址
 * Arrays是一个辅助类
 */
public class ArrayTest2 {
    public static void main(String[] args){
        char[] ch1=new char[2];
        ch1[0]='a';
        ch1[0]='b';
        
        char[] ch2=new char[2];
        ch2[0]='a';
        ch2[0]='b';
        
        System.out.println(ch1.equals(ch2));
        
        System.out.println("------------");
        String s1=new String(ch1);
        String s2=new String(ch2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        
        System.out.println("------------");
        System.out.println(Arrays.equals(ch1, ch2));
    }
}
