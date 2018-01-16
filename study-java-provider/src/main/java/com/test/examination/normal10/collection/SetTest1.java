package com.test.examination.normal10.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        set.add("abc");
        set.add("xyz");
        set.add("abc");
        for(String s:set){
            System.out.println(s);
        }
    }
}
