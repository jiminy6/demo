package com.itheima;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader=new SAXReader();
		Document document=reader.read("src//com//itheima//a.xml");
		System.out.println(document);
	}
}
