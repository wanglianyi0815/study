package com.test.design.pattern.normal16;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public interface Iterator {
    //前移
    Object previous();

    //后移
    Object next();

    boolean hasNext();

    //取得第一个元素
    Object first();
}
