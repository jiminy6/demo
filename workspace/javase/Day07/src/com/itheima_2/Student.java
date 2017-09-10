package com.itheima_2;

public class Student {
	private String name;
	private String num;
	public Student() {
		
	}
	public Student(String num, String name) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}
	
	
}
