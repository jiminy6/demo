package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 定义一个Map集合,key为String,value也为String
 *  向Map中存入以下内容 
 *  key=ITCAST001 value=张三 key=ITCAST002 value=李四 key=ITCAST005 value=李四 利用keySet获取所有的key,并且遍历出所有的key
 *  利用values方法获取所有的value,并且遍历所有的value 
 * */
public class Demo3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("ITCAST001","张三");
		map.put("ITCAST002", "李四");
		map.put("ITCAST005", "李四");
//		Set<Entry<String, String>> keys = map.entrySet();
//		for (Entry<String, String> entry : keys) {
//			System.out.println(entry);
//		}
		Set<String> keys = map.keySet();
		for (String string : keys) {
			String value=map.get(string);
			System.out.println(value);
		}
	}
}
