package com.itheima;

public class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(this.getClass()!=obj.getClass()){
			return false;
		}
		Person p=(Person)obj;
		if(!p.name.equals(this.name)){
			return false;
		}
		if(p.age!=this.age){
			return false;
		}
		return true;
	}
	
	
}
