package com.test.examination.normal03.jvm;

/**
 * 测试classForName.
 * Created by wanglianyi on 2017/12/7 0007.
 */
public class TestClassForName {

    public static void main(String[] args) throws Exception {
        (new TestClassForName()).loadClass();
    }

    @SuppressWarnings("unchecked")
    public void loadClass() throws Exception {
        Class<Test> clazz = (Class<Test>) Class.forName("com.test.examination.normal03.jvm.Test");
        //Class<Test> clazz = (Class<Test>) Class.forName("com.test.examination.normal03.jvm.Test", false, getClass().getClassLoader());
        //Test test=new Test();
        Test test=clazz.newInstance();
    }

}

class Test {

    static {
        System.err.println("类的静态初始化块");
    }

    public Test() {
        System.err.println("实例化类");
    }

}