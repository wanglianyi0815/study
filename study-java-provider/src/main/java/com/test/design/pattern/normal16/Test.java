package com.test.design.pattern.normal16;

/**
 * 迭代子模式
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，
 * 集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
 * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
