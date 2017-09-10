package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Student,String> map = new HashMap<Student,String>();
		Student s = new Student("张三",12);
		Student s1 = new Student("李四",12);
		map.put(s, "001");
		map.put(s1, "002");
//		Set<Student>keys=map.keySet();
//		for (Student key : keys) {
//			String value=map.get(key);
//			System.out.println(key+"="+value );
//		}s
		Set<Map.Entry<Student,String>>entrys=map.entrySet();
		for (Map.Entry<Student, String> entry : entrys) {
			Student key=entry.getKey();

			String value=entry.getValue();
			System.out.println(key+" = "+value);
			
		}
	}
}
