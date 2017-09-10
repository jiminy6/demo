package com.itheima_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		//创建Map对象
				Map<String,String> map = new HashMap<String,String>();
				//添加映射关系
				map.put("尹志平", "小龙女");
				map.put("令狐冲", "东方菇凉");
				map.put("玄慈", "叶二娘");
				//获取所有的结婚证对象
				Set<Map.Entry<String,String>>entrys=map.entrySet();
				for (Map.Entry<String, String> entry : entrys) {
					String name=entry.getKey();
					String num=entry.getValue();
					System.out.println(name+"   "+num);
				}
				
	}
}
