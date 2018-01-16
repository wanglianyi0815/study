package com.test.examination.normal03.jvm;

public class EqualsTest {
    /**
     * ==和equals方法的区别
     */
    public static void main(String[] args){
        String str=new String("abc");
        String str2=new String("abc");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println("-------------------------------");
        Object object=new Object();
        Object object2=new Object();
        System.out.println(object==object2);
        System.out.println(object.equals(object2));
        /**
         * 1、object里的equals和==是一样的，如果子类重写了object.equals方法，则有可能比较内容（例如String）
         * 2、==永远比较的是内存地址
         * 重写equals方法：1、==操作为真则直接返回真。2、判断instanceof操作，如果两个对象的类不一致，则返回假。3、.....
         * 
         * 可参考normal10.collection.SetTest2.java
         */
    }
}
