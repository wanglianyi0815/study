package com.test.examination.normal21.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("world");
		list.add("helloworld");
		
		/**
		 * 
		 */
		/*for(int i = 0; i < list.size() ;++i)
		{
			list.remove(i);
		}*/
		
		
		
		for(Iterator<String> i = list.iterator(); i.hasNext();)
		{
			String str = i.next();
			
			System.out.println(str);
			
			//放开此行代码会报错，不能用list进行删除，iterator会记录list的modCount属性，发生变化，则抛出异常
			//list.remove("helloworld");
			
			i.remove();
		}
		
		System.out.println(list.size());
		System.out.println(list.get(0));
	}

}
