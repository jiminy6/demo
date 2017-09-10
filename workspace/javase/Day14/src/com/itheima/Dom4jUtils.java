package com.itheima;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Dom4jUtils {

	private Dom4jUtils() {

	}

	public static Document getDocumet() throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read("src/com/itheima/a.xml");
		return document;
	}
}
