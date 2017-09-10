package com.itheima;

public class Teacher {
	String name;
	int age;
 
	//静态代码块：随着类的加载而加载，只加载一次，加载类时需要做的一些初始化，比如加载驱动
	static {
		System.out.println("我爱Java");
	}
	
	public Teacher() {
		System.out.println("我是无参空构造");
	}
	
	public Teacher(String name,int age) {
		System.out.println("我是有参构造");
		
		this.name = name;
		this.age = age;
	}

}
