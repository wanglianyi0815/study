package com.test.examination.normal19.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * dom: document object model -->可读写 文档对象模型 idl interface description lanaguage
 * sax: simple aips for xml xml -->可读 解析的简单api 民间标准 基于事件的处理，观察者模式 (jdk提供了observer observable) gui
 * jaxp： java apis for xml parsing,对xml进行解析的apis 既包含了dom也包含了sax,这里用到了工厂方法
 * @author 王连宜
 *
 */
public class DomTest {
	/**
	 * 对于jdk（帮助文档）中的javax.xml.parsers来说，处理xml文档的过程:
	 * 1、获得解析工厂
	 * 2、通过工厂来获得具体的解析器
	 * 3、通过解析器来对xml处理
	 * 课程作业：描述DTD和SCHEMA都是做什么用的
	 */
	public static void main(String[] args) throws Exception{
		//step1:获得解析器工厂
		DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
		//step2:获得具体的解析器实例
		DocumentBuilder builder = docFactory.newDocumentBuilder();
		//step3：通过解析器实例来获得document对象(对应整个xml文档的根节点，是解析xml文档的入口，此处的people叫做根元素节点)
		Document document=builder.parse(new File("D:/myeclipsework/MyProject/test/src/com/test/examination/normal19/xml/persons.xml"));
		//得到实现的解析器的类
		System.out.println(document.getImplementation());
		
		NodeList list=document.getElementsByTagName("person");
		
		System.out.println(list.getLength());
		
		for(int i=0;i<list.getLength();i++){
			Node node=list.item(i);
			Element element=(Element)node;
			System.out.println(element.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
		}
	}
}
