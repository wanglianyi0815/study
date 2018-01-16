package com.test.examination.normal19.xml;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * jdom http://jdom.org
 * @author 王连宜
 *
 * sax: simple apis for xml,观察者模式
 * sax:只能顺序访问，dom：可以随机访问
 */
public class SaxTest {
	public static void main(String[] args) throws Exception{
		//step1:获得解析器工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//step2:获得解析器实例
		SAXParser parser = factory.newSAXParser();
		//开始解析文档
		parser.parse(new File("D:/myeclipsework/MyProject/test/src/com/test/examination/normal19/xml/persons.xml"), new myHandler());
		
	}
}

class myHandler extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		System.out.println(" ------ start document ------ ");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("----------end document-----------");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("startElement name :"+ qName);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("endElement name:"+qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String content=new String(ch,start,length);
		//xml解析包含空格，导致输出结果有空行
		System.out.println("Element content:"+content);
	}
}