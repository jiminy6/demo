package com.itheima;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("001","张三");
		map.put("002", "李四");
		map.put("003", "王五");
		Set<String> keys =map.keySet(); 
		for (String key : keys) {
		//	System.out.println(key);
			String haha=map.get(key);
			System.out.println(key+"    "+haha);
		}
//		Collection<String>values=map.values();
//		for (String value : values) {
//			System.out.println(value);
//		}
	}
}
