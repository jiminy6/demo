package com.itheima;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 定义一个学生类,学生类中有name和age两个属性 创建三个学生对象,分别对name和age赋值 然后以key为学生对象,value为学生的学号的方式 存入HashMap集合,利用两种方式遍历这个Map 
 * */
public class Demo7 {
	public static void main(String[] args) {
		HashMap<Student,String> map = new HashMap<>();
		Student s = new Student("xxxx",12);
		Student s1 = new Student("xxsds",223);
		Student s2 = new Student("xxsds",223);
		map.put(s, "001");
		map.put(s1, "002");
		map.put(s2, "003");
		Set<Entry<Student, String>> entrys = map.entrySet();
		for (Entry<Student, String> entry : entrys) {
			Student stu=entry.getKey();
			String value=entry.getValue();
			System.out.println(stu+"="+value);
		}
	}
}
