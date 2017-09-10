package com.itheima5;

public class InnterDemo {
	public static void main(String[] args) {
//		method(new Dog());
//		method(new Cat());
		
		method(
				new Animal() {
					
					@Override
					public void eat() {
						System.out.println("狗吃骨头");
						
					}
				}
				);
	}
	public static void method(Animal a){
		a.eat();
	}
}
