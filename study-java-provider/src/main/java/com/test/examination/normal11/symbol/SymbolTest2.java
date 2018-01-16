package com.test.examination.normal11.symbol;
/**
 * 在java中一个字符能否表示一个汉字?
 * 答：可以
 * 在java中，一个字符表示16位，相当于两个字节，（1byte=8bit）
 * 一个数字应该是占用32位
 */
public class SymbolTest2 {
    public static void main(String[] args){
        char c='北';
        System.out.println(c);
        
        c=4;
        System.out.println(c);
        
        char ch='\u0001';
        System.out.println(ch);
    }
}
