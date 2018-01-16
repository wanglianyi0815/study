package com.test.examination.normal10.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 1、当向set集合中增加对象时，首先集合计算要计算要增加对象的hashcode码，根据该值来得到一个位置，当在该
 *    位置没有一个对象存在的化，那么集合set认为该对象在集合中不存在，直接增加进去
 *        如果在该位置有一个对象，接着将准备增加到集合中的对象与该位置上的对象进行equals方法比较，
 *    如果该equals方法返回false，那么集合set认为集合中不存在该对象，再进行一次散列，将该对象放到散列后
 *    计算出的新地址里，如果equals方法返回ture，那么集合认为集合中已经存在该对象了，不会再将该对象增加
 *    到集合中。
 * 2、当重写equals方法时，必须要重写hashCode方法
 *    如果一个类的两个对象，使用equals方法比较时，结果为true，那么该两个对象必须具有相同的hashCode
 */
public class SetTest2 {
    public static void main(String[] args){
        Set<People> set=new HashSet<People>();
        People a=new People("zhangsan");
        People b=new People("lisi");
        People c=new People("zhangsan");
        set.add(a);
        set.add(b);
        set.add(c);
        for(People p:set){
            System.out.println(p.name);
        }
        Object o=new Object();
        System.out.println(Integer.toHexString(o.hashCode()));
    }
}

class People{
    String name;
    public People(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    
    /**
     * 重写equals方法的时候，一定要重写hashCode方法
     */
    public boolean equals(Object object){
        if(this==object){
            return true;
        }
        if(object instanceof People){
            People pa=(People)object;
            if(this.name.equals(pa.getName())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    /**
     * 如果去掉此方法，则会增加进去三个对象，有此方法则为两个对象
     */
    public int hashCode(){
        return name.hashCode();
    }
}
