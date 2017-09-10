package com.itheima;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
public class XmlDemo {
	public static void main(String[] args) throws DocumentException {
		Document document =Dom4jUtils.getDocumet();
		Element rootElement=document.getRootElement();
		List<Element>elements=rootElement.elements();
		Element cityElement=elements.get(0);
		String text=cityElement.elementText("name");
		System.out.println(text);
		//
		
	}
}
