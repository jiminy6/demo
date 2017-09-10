package com.itheima;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		Person p = new Person("zhangsan",18);
		Person p2 = new Person("lisi",20);
		Person p3 = new Person("lisi",20);
		set.add(p2);
		set.add(p);
		set.add(p3);
		for (Person person : set) {
			System.out.println(person);
		}
	}
}
