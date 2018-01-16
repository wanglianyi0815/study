package com.test.design.pattern.normal10;

/**
 *
 * Created by wanglianyi on 2017/1/28.
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
