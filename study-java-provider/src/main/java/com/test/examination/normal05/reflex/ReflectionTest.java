package com.test.examination.normal05.reflex;

public class ReflectionTest {
    /**
     * 获得某个类的class对象方式
     * 1、使用类的.class语法
     * 2、通过类的getClass方法
     * 3、通过Class对象的forName方法
     * 4、对于包装类，（8个 Integer。。。） 可以通过.type来获取
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception{
        Class<?> clazz=PrivateTest.class;
        /**
         * getDeclaredField与getField的区别是：是否返回对象中private的成员变量
         */
        java.lang.reflect.Field field=clazz.getDeclaredField("name");
        
        PrivateTest pt=new PrivateTest();

        /**
         * 不去检查private的访问权限
         */
        field.setAccessible(true);
        
        field.set(pt,"world");
        
        System.out.println(pt.getName());
    }
}
