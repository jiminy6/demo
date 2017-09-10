package com.itheima;

public class FinalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
	// 	d.NUM=12;
	}
}
class Animal{
	public  void eat(){
		System.out.println("大吃一顿");
		
	}
}
class Dog extends Animal{
//	public void eat(){
//		
//	}
	final int NUM=10;
}
