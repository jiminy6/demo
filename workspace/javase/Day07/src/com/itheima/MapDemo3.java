package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,Map<String,String>> hm = new HashMap<>();
		Map<String,String> base = new HashMap<String,String>();
		base.put("01", "张三");
		base.put("02", "李四");
		Map<String,String> job = new HashMap<String,String>();
		job.put("01", "张三");
		job.put("03", "haha");
		hm.put("基础班", base);
		hm.put("就业班", job);
		Set<String>keys=hm.keySet();
		for (String key : keys) {
			System.out.println("班级名称:"+key);
			Map<String,String>stu=hm.get(key);
			Set<String>nums=stu.keySet();
			for (String num : nums) {
				String name=stu.get(num);
				System.out.println("学号："+num+"姓名："+name);
			}
		}
		
	}
}
