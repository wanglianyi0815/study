package com.test.examination.normal24.clone;
/**
 * 说明：
 * ①为什么我们在派生类中覆盖Object的clone()方法时，一定要调用super.clone()呢？
 *    在运行时刻，Object中的clone()识别出你要复制的是哪一个对象，然后为此对象分配空间，并进行对象的复制，将原始对象的内容一一复制到新对象的存储空间中。
 * ②继承自java.lang.Object类的clone()方法是浅复制
*/
public class CloneTest2
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Teacher teacher = new Teacher();

		teacher.setAge(40);
		teacher.setName("Teacher Zhang");

		Student2 s1 = new Student2();

		s1.setAge(20);
		s1.setName("zhangsan");
		s1.setTeacher(teacher);

		Student2 s2 = (Student2) s1.clone();

		System.out.println(s2.getAge());
		System.out.println(s2.getName());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println(s2.getTeacher().getAge());
		System.out.println(s2.getTeacher().getName());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		s2.getTeacher().setAge(50);
		s2.getTeacher().setName("Teacher Li");

		System.out.println(s1.getTeacher().getAge());
		System.out.println(s1.getTeacher().getName());

	}

}

class Teacher implements Cloneable
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
		return super.clone();
	}

}

class Student2 implements Cloneable
{
	private int age;

	private String name;

	private Teacher teacher;

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

	public Teacher getTeacher()
	{
		return teacher;
	}

	public void setTeacher(Teacher teacher)
	{
		this.teacher = teacher;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Student2 student2 = (Student2) super.clone();

		student2.setTeacher((Teacher) student2.getTeacher().clone());

		return student2;

	}

}
