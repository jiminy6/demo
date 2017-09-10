package com.itheima;

public class Student {
	String name;
	int age;
	public Student() {
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	 
}
