package com.itheima;

public class ExtendsDemo2 {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.show();
		System.out.println();
	}
}
class Dad{
	String name="haha";
	
}
class Kid extends Dad{
	public void show(){
		System.out.println(name);
	}
}
