package com.itheima_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JiuYeDemo {
	public static void main(String[] args) {
		Map<String,List<Student>> itheima = new HashMap<String,List<Student>>();
		List<Student>base=new ArrayList<Student>();
		base.add(new Student("01", "zhangsan"));
		base.add(new Student("02", "lisi"));
		List<Student>job=new ArrayList<>();
		job.add(new Student("01", "wangwu"));
		job.add(new Student("02", "zhaoliu"));
		itheima.put("就业班",job);
		itheima.put("基础班", base);
		Set<Map.Entry<String,List<Student>>>entrys=itheima.entrySet();
		for (Map.Entry<String, List<Student>> entry : entrys) {
			String key=entry.getKey();
			System.out.println(key);
			List<Student>value=entry.getValue();
			for (Student student : value) {
				System.out.println(student);
			}
		}
	}
}
