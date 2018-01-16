package com.test.examination.normal01.string;

public class StringTest2 {
    /**
     * 
     */
    public static void main(String[] args){
        /**
         * string是一个final的类，不能被继承
         */
        String hello="hello";
        String lo="lo";
        /**
         * 加操作没有在堆里生成新的对象，两个都是固定的字符串
         */
        System.out.println(hello=="hel"+"lo");
        /**
         * 加操作在堆里生成新的对象，有一个是字符串变量
         * 所以在做大量字符串拼接的时候，用StringBuffer会提升效率
         * StringBuffer是同步的，StringBuilder是异步的
         */
        System.out.println(hello=="hel"+lo);
    }
}
