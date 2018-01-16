package com.test.design.pattern.normal16;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public interface Collection {
    Iterator iterator();

    /*取得集合元素*/
    Object get(int i);

    /*取得集合大小*/
    int size();
}
