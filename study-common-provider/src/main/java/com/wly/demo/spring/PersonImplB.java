package com.wly.demo.spring;

public class PersonImplB implements Person
{
	private String name;
	
	private PersonImplA a;

	public void setName(String name)
	{
		this.name = name;
	}

	public String say()
	{
		return "Hello, " + name;
	}

    /**
     * @return a
     */
    public PersonImplA getA() {
        return a;
    }

    /**
     * @param a 要设置的 a
     */
    public void setA(PersonImplA a) {
        this.a = a;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }
}
