package com.wly.demo.spring;

public class PersonImplA {
    private String name;
    
    private PersonImplB b;

    public void setName(String name)
    {
        this.name = name;
    }

    public String say()
    {
        
        return "Hello, " + name;
    }

    /**
     * @return b
     */
    public PersonImplB getB() {
        return b;
    }

    /**
     * @param b 要设置的 b
     */
    public void setB(PersonImplB b) {
        this.b = b;
    }
    
}
