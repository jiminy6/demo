package com.itheima_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo5 {
	public static void main(String[] args) {
		//创建Map对象
				HashMap<Student,String> hm = new HashMap<Student,String>();
				//创建key对象
				Student s = new Student("zhangsan","18");
				Student s2 = new Student("lisi","20");
				Student s3 = new Student("lisi","20");
				
				//添加映射关系
				hm.put(s, "ITCAST001");
				hm.put(s2, "ITCAST002");
				hm.put(s3, "ITCAST002");
				
//				Set<Map.Entry<Student,String>>entrys=hm.entrySet();
//			for (Map.Entry<Student, String> entry : entrys) {
//				Student s5=entry.getKey();
//				String s1=entry.getValue();
//				System.out.println(s5+"  "+s1);
//			}
				Set<Student>keys=hm.keySet();
				for (Student key : keys) {
					String value=hm.get(key);
					System.out.println(key+"  "+value);
		
				}

	}
}
