package com.test.examination.normal02.param;

public class ParamTest {
    public void changeInt(int a){
        a=3;
    }
    
    public void changePoint(Point p){
        p.x=5;
        p.y=6;
    }
    
    public void changeString(String s){
        s=new String("abc");
    }
    
    public static void main(String[] args){
        ParamTest pa=new ParamTest();
        
        int a=1;
        /**
         * 原生类型只是把值传递过去，方法里的成员参数和此处的a不相互影响
         */
        pa.changeInt(a);
        System.out.println(a);
        System.out.println("-------------------");
        
        Point po=new Point(1,2);
        /**
         * 传递引用类型是时，把对 对象的引用  值传递过去，也就是内存地址
         * 对于方法的参数传递，不管是原生数据类型还是引用类型，一律传值：pass by value
         */
        pa.changePoint(po);
        System.out.println(po.x);
        System.out.println(po.y);
        System.out.println("-------------------");
        
        
        String str1="xyz";
        /**
         * 重新在池里生成对象，只是把方法里的引用地址改变了，并没有改变方法外的引用地址改变
         */
        pa.changeString(str1);
        System.out.println(str1);
        
        String str2=new String("xyz");
        pa.changeString(str2);
        System.out.println(str2);
    }
}

class Point{
    int x;
    int y;
    
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}