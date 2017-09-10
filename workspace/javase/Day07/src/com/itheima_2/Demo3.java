package com.itheima_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		//添加映射关系
		map.put("谢婷疯", "张箔纸");
		map.put("陈关西", "钟欣桶");
		map.put("李亚碰", "王飞");
		Set<String>keys=map.keySet();
		for (String key : keys) {
			String value=map.get(key);
			System.out.println(key +"   "+value);
		}
	}
}
