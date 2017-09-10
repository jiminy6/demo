package com.itheima;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("ITCAST001", "张三");
		map.put("ITCAST002", "李四");
		map.put("ITCAST005", "李四");
		Set<String>keys=map.keySet();
		for (String key: keys) {
			System.out.println(key);
		}
		Collection<String >values=map.values();
		for (String value : values) {
			System.out.println(value);
		}

	}
}
