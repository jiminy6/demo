package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 定义一个HashMap集合
 * ,key和value都是为String类型 存入以下内容 
 * key=谢婷疯 value=张箔纸 key=陈关西 value=钟欣桶 key=李亚碰 
 * value=王飞 利用keySet和getKey方法遍历出集合中的key和value 
 * 
 * */
public class Demo5 {
public static void main(String[] args) {
	Map<String ,String> map = new HashMap<>();
	map.put("谢婷疯 ","张柏芝");
	map.put("陈关西", "钟欣桶");
	map.put("李亚碰", "王菲");
	Set<String> keys = map.keySet();
	for (String key : keys) {
		String value=map.get(key);
		System.out.println(key+"="+value);
	}
}
}
