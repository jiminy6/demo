package com.itheima2;

public class AbstractTest2 {
	public static void main(String[] args) {
		Coder c = new Coder();
		c.work();
		Manager m = new Manager();
		m.work();
	
}
}
abstract class Employee {
	String name;
	double salary;
	String id;

	public abstract void work();
}

class Manager extends Employee {
	int bonus;
	public void work(){
		System.out.println("我来看着你工作");
	}
}
 class Coder extends Employee{
	public void work(){
		System.out.println("我来打代码");
	}
}
