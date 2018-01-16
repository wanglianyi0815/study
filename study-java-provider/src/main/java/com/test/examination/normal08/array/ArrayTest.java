package com.test.examination.normal08.array;

public class ArrayTest {

    public static void main(String[] args){
        /**
         * 数组里面存放的是数组元素的引用地址
         */
        I[] i=new I[2];
        //接口不能被实例化
        //I i=new I();
        System.out.println(i[0]);
        System.out.println(i[1]);
        i[0]=new C();
        i[1]=new C();
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}

interface I{
    
}

class C implements I{
    
}