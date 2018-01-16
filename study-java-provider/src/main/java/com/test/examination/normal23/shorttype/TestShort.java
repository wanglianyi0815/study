package com.test.examination.normal23.shorttype;
/**
 * 问short s = 1;s = s + 1;
 *   short a=1;a+=1;两个语句是否能够编译通过
 * @author Administrator
 *
 */
public class TestShort {
	public static void main(String[] args) {
		   short s = 1;
		   //此行代码放开会报short转int的异常
		   //s = s + 1;
		   int b=s+1;
		   System.out.println(b);

		   short a = 1;
		   a += 1;
		   System.out.println(a);
	}
}
