package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTrace {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1","a");
		map.put("2","b");
		map.put("3", "c");
	//	Set<Map.Entry<String,String>> entrys=map.entrySet();
		Set<Map.Entry<String, String>>entrys=map.entrySet();
//		for (Map.Entry<String, String> entry : entrys) {
//			
//		}
		for (Map.Entry<String, String> entry : entrys) {
			//System.out.println(entry);
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"   "+value);
		}
		
	}
}
