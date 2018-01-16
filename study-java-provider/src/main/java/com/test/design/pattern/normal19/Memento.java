package com.test.design.pattern.normal19;

/**
 *
 * Created by wanglianyi on 2017/1/29.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
