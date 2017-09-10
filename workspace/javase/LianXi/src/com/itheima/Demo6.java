package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 定义一个Map集合,key为String,value也为String 向Map中存入以下内容 key=尹志平 value=小龙女 key=令狐冲 value=东方菇凉 key=玄慈 value=叶二娘 利用entrySet方法便利Map集合 
 * 
 * */
public class Demo6 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("尹志平", "小龙女");
		map.put("令狐冲", "东方姑娘");
		map.put("玄慈", "叶二娘");
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			String key=entry.getKey();
			map.put(key, "sds");
			String value=entry.getValue();
			System.out.println(key+"="+value);
		}
	}
}
