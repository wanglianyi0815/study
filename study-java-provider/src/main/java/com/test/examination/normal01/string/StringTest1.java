package com.test.examination.normal01.string;

public class StringTest1 {

    public static void main(String[] args) {
        /**
         * 此行代码生成两个对象,string pool里有一个对象，jvm堆里有一个对象
         * s为引用，是一个内存地址，指向jvm堆里的对象
         */
        String s=new String("abc");
        /**
         * 此行代码并没有生成一个新的对象
         * 首先检查是否有abc这个字符串，s1指向string pool里的对象
         */
        String s1="abc";
        
        /**
         * 只要有new存在，就会在堆里新生成一个对象
         */
        String s2=new String("abc");
        String s3="abc";
        System.out.println(s==s1);
        /**
         * ==表示对象的内存地址是否一样
         */
        System.out.println(s==s2);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        
        
        System.out.println("--------------------------");
        /**
         * intern方法表示把堆里的对象同步到 string pool（不重复）里
         * 并返回string pool里的对象
         */
        System.out.println(s1==s1.intern());
        System.out.println(s==s.intern());
        System.out.println(s.intern()==s1.intern());
    }

}
