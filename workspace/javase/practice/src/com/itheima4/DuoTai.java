package com.itheima4;

public class DuoTai {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.swim();
		Animal s=new Dog();
	s.eat();
	Dog a=(Dog)d;
	a.swim();
	}
}
class Animal{
	public void eat(){
		
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("吃肉");
	}
	public void swim(){
		System.out.println("狗趴");
	}
}
