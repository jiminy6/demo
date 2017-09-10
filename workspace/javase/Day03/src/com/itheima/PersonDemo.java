package com.itheima;

public class PersonDemo {
	public static void main(String[] args) {
		new Person() {
			
			@Override
			public void eat() {
				System.out.println("我要吃饭了");
			}
		}.eat();;
	}
}
