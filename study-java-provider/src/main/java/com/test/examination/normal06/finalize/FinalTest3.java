package com.test.examination.normal06.finalize;

public class FinalTest3 {
    public static final StringBuffer s=new StringBuffer();
    
    public static void main(String[] args){
        /**
         * 对于final类型的引用变量来说，所谓的不能改变，指的是该引用不能改变
         * 对于所指向的内容是可以改变的
         */
        s.append("hello");
        //final 不能指向另一个对象
        //s=new StringBuffer();
        System.out.println(s);
    }
}
