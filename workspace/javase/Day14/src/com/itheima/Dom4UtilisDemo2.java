package com.itheima;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class Dom4UtilisDemo2 {
	public static void main(String[] args) throws DocumentException {
		Document document=Dom4jUtils.getDocumet();
		Element rootElement=document.getRootElement();
		treewalk(rootElement);
	}
	public static void treewalk(Element element){
		System.out.println(element.getName());
		List<Element>es=element.elements();
		for (Element e : es) {
			treewalk(e);
		}
	}
}
