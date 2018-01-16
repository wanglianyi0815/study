package com.test.examination.normal10.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * ArrayList,LinkedList,Vector的区别?
 * 
 */
public class ListTest {
    /**
     * 1、ArrayList底层实际是采用数组实现的(并且该数组的类型的Object类型)
     * 2、List list=new ArrayList()时，默认会初始化一个10长度的数组,当list长度超过10的时候（add方法），
     *    并且jdk6的话， 采用Arrays.copyOf来生成一个新的数组
     *    如果是jdk5的话，使用System.arrayCopy方法来新生成一个数组。
     * 3、对于ArrayList与Vector来说，底层都是采用数组方式来实现的（该数组是一个Object类型的数组）
     * 4、对于ArrayList,所有的方法都不是同步的，对于Vector,大部分public的方法都是同步的
     * 5、对于ArrayList和Vector，查找速度非常快，增加、删除速度非常慢（不涉及最后一个元素的删除和新增）。(本质上是由数组的特点来决定的)
     * 6、对于LinkedList,查找速度非常慢，增加、删除速度非常快（本质上是有双向循环链表的特点来决定的）
     */
    public static void main(String[] args){
        List aList=new ArrayList();//看源码
        Vector vector = new Vector();//看源码
        List lList=new LinkedList();//看源码
    }
}
