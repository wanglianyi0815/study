package com.test.examination.normal24.clone;

/**
 * 浅复制（浅克隆）：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。
 * 深复制（深克隆）：被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。换言之，深复制把要复制的对象所引用的对象都复制了一遍。
 * Java的clone()方法【定义在Object类中】
 *  clone方法将对象复制了一份并返回给调用者。一般而言，clone（）方法满足：
 *  ①对任何的对象x，都有x.clone() !=x 克隆对象与原对象不是同一个对象
 *  ②对任何的对象x，都有x.clone().getClass()= =x.getClass() 克隆对象与原对象的类型一样
 *  ③如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。
 * Java中对象的克隆
 *  ①为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。
 *  ②在派生类中覆盖基类的clone()方法，并声明为public【Object类中的clone()方法为protected的】。
 *  ③在派生类的clone()方法中，调用super.clone()。
 *  ④在派生类中实现Cloneable接口。
 */
public class CloneTest1
{

	public static void main(String[] args)throws CloneNotSupportedException
	{
		Student student = new Student();
		
		student.setAge(20);
		student.setName("zhangsan");
		
		Student student2 = (Student)student.clone();
		
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
		student2.setName("lisi");
		
		System.out.println(student.getName());
		System.out.println(student2.getName());
	}

}


class Student implements Cloneable
{
	private int age;
	
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Object object = super.clone();
		
		return object;
	}
	
	
}