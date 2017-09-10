package com.itheima6;

public class InnerDemo {
	public static void main(String[] args) {
		method(new Men());
		method(new Woman());
	}
	public static void method(Person a){
		a.eat();
	}
}
