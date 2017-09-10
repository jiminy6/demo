package com.itheima;

import java.util.HashMap;
import java.util.Map;

/*
 * V put(K key, V value) V get(Object key) int size()
 *  boolean containsKey(Object key) boolean containsValue(Object value) 
 * boolean isEmpty() void clear() V remove(Object key) 
 * */
public class Demo4 {
	public static void main(String[] args) {
		Map<String ,String> map = new HashMap<>();
		map.put("老王","王大锤");
		map.get("老王");
		System.out.println(map.containsKey("老王"));
		System.out.println(map.isEmpty());
		System.out.println(map.remove("老王"));
	}
}
