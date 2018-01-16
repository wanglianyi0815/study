package com.wly.demo.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SpringTest
{
	private DefaultListableBeanFactory factory;

	public static void main(String[] args)
	{
		/**
		 * 一、org.springframework.beans.factory.BeanFactory
		 *     1、beanFactory是一个根容器，描述了整个IOC容器的规范和原则（ctrl+t->BeanFactory）
		 *        例如：对象的生命周期，更支持使用类与类之间的注入而不是BeanFactory的lookup等
		 *     2、用来创建对象和管理对象
		 *     
		 *    org.springframework.beans.factory.config.BeanDefinition
		 * 二、org.springframework.beans.factory.FactoryBean
		 */
		ClassPathResource resource = new ClassPathResource("beans.xml");
		
		DefaultListableBeanFactory factory =  new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions(resource);
		
		PersonImplA personA = (PersonImplA) factory.getBean("personA");
		
		System.out.println(personA.say());
		
		PersonImplB personB = (PersonImplB)factory.getBean("personB");
		
		System.out.println(personA == personB.getA());
	}
}
