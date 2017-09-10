package com.itheima;

public abstract class Employee {
	String name;
	int salary;
	int id;
	public abstract void work();
}
 class Coder extends Employee{
	public void work(){
		System.out.println("我来打代码");
	}
}
 class Manamger extends Employee {
	 public void work(){
		 System.out.println("我来看你们工作");
	 }
 }
 
  
