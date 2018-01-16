package com.test.examination.normal04.comple;

public class Test {
    public static void main(String[] args) throws Exception{
        Partent p=new Child();
        p.output();
    }
}

/**
 * 关于java重写
 * 1、子类的和父类的方法名，成员参数，返回类型均相同
 * 2、子类的访问级别一定要高于父类的访问级别（把child的output方法修改成private后无法编译）
 * 3、子类中的方法抛出的异常范围不能大于父类中方法抛出异常的范围(把child的output方法抛出异常换成Exception则无法编译)
 */
class Partent{
    public void output() throws NullPointerException{
        System.out.println("parent");
    }
}

class Child extends Partent{
    public void output() throws NullPointerException{
        System.out.println("child");
    }
}