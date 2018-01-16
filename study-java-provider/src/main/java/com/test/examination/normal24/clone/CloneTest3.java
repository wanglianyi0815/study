package com.test.examination.normal24.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 把对象写到流里的过程是序列化（Serilization）过程，而把对象从流中读出来的过程则叫做反序列化（Deserialization）过程。应当指出的是，写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
 * 在Java语言里深复制一个对象，常常可以先使对象实现Serializable接口，然后把对象（实际上只是对象的一个拷贝）写到一个流里，再从流里读出来，便可以重建对象。
 * 这样做的前提是对象以及对象内部所有引用到的对象都是可串行化的，否则，就需要仔细考察那些不可串行化的对象可否设成transient，从而将之排除在复制过程之外。
 * 注意：Cloneable与Serializable都是marker Interface,也就是说他们只是一个标识接口，没有定义任何方法。
 *
 */
public class CloneTest3
{
	/**
	 * 当一个类实现了Serializable接口时，表明该类可被序列化，这个时候Eclipse会要求你为该类定义一个字段，该字段名字为serialVersionUID，类型为long，提示信息如下
	 * The serializable class Student4 does not declare a static final serialVersionUID field of type long
	 * 你可以随便写一个，在Eclipse中它替你生成一个，有两种生成方式：
	 *   1、一个是默认的1L，比如：private static final long serialVersionUID = 1L;
	 *   2、一个是根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段，比如：private static final long serialVersionUID = 8940196742313994740L;之类的。
	 *   
	 *   当你一个类实现了Serializable接口，如果没有定义serialVersionUID，Eclipse会提供这个提示功能告诉你去定义之。 在Eclipse中点击类中warning的图标一下【即那个黄色的图标】，Eclipse就会自动给定两种生成的方式，如上面所述。如果不想定义它，在Eclipse的设置中也可以把它关掉的，设置如下
	 *   如果你没有考虑到兼容性问题时，就把它关掉，不过有这个功能是好的，只要任何类别实现了Serializable这个接口的话，如果没有加入serialVersionUID，Eclipse都会给你warning提示，这个serialVersionUID为了让该类别Serializable向后兼容。 
	 *   如果你的对象序列化后存到硬盘上面后，可是后来你却更改了类的field(增加或减少或改名)，当你反序列化时，就会出现Exception的，这样就会造成不兼容性的问题。 但当serialVersionUID相同时，它就会将不一样的field以type的缺省值Deserialize，这个可以避开不兼容性的问题。
	 */
	public static void main(String[] args) throws Exception
	{
		Teacher3 t = new Teacher3();

		t.setAge(40);
		t.setName("Teacher Zhang");

		Student3 s1 = new Student3();

		s1.setAge(20);
		s1.setName("zhangsan");
		s1.setTeacher(t);

		Student3 s2 = (Student3) s1.deepCopy();

		System.out.println(s2.getAge());
		System.out.println(s2.getName());

		System.out.println("~~~~~~~~~~~~~~~~~~~");

		System.out.println(s2.getTeacher().getAge());
		System.out.println(s2.getTeacher().getName());

		s2.getTeacher().setAge(50);
		s2.getTeacher().setName("Teacher Li");

		System.out.println("~~~~~~~~~~~~~~~~~~~");

		System.out.println(s1.getTeacher().getAge());
		System.out.println(s1.getTeacher().getName());

	}

}

class Teacher3 implements Serializable
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

}

class Student3 implements Serializable
{
	private int age;

	private String name;

	private Teacher3 teacher;

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

	public Teacher3 getTeacher()
	{
		return teacher;
	}

	public void setTeacher(Teacher3 teacher)
	{
		this.teacher = teacher;
	}

	public Object deepCopy() throws Exception
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());

		ObjectInputStream ois = new ObjectInputStream(bis);

		return ois.readObject();

	}
}
