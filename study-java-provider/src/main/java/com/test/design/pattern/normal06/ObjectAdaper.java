package com.test.design.pattern.normal06;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题.
 * Created by wanglianyi on 2017/1/28.
 */
public class ObjectAdaper implements Targetable{
    private Source source;
    public ObjectAdaper(Source source){
        super();
        this.source=source;
    }

    public void method1(){
        source.method1();
    }

    public void method2(){
        System.out.println("this is targetable method");
    }

    public static void main(String[] args){
        Source source = new Source();
        Targetable target = new ObjectAdaper(source);
        target.method1();
        target.method2();
    }


}
