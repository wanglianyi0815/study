package com.test.examination.normal10.collection;

import java.util.HashSet;
import java.util.Set;
/**
 * 介绍hashcode,equals,hashset,hashmap的不同
 * 1、HashSet时采用HashMap来实现的--->扩展:transient--->学习一下
 * 2、这个HashMap的Key就是放进HashSet中的对象，value就是一个Object类型对象.
 * 3、当调用HashSet的add方法时，实际上是向HashMap中增加了一行（key-value对）,该行的key就是想HashSet中增加的那个
 *    对象，改行的value是一个 static final 的对象
 * 4、HashMap底层是采用数组来维护的,Entry的数组，Entry里有next,next不在数组里边
 * 5、掉用增加的那个对象的hashCode方法来得到一个hashCode值，根据该值来计算出一个数组的下表索引（计算出数组中的一
 *    个位置）
 * 6、将准备增加到map对象与该位置上的对象进行比较（equals方法），如果相同，那么就将该位置上的那个对象（Entry类型）
 *    的value值替换掉，否则沿着该Entry的链继续重复上述过程,如果到链的最后仍然没有找到与此对象相同的对象，那么这个
 *    时候会将该对象增加到数组中，将数组中该位置上的那个Entry对象链到该对象的后边
 * 7、对于HashSet,HashMap来说，这样做是为了提高效率，使得查找时间不随着Set或者Map的大小而改变
 */
public class HashTest {
    /**
     * 
     */
    public static void main(String[] args){
        //跟代码,看map变量和add方法
        Set set=new HashSet();
    }
}
