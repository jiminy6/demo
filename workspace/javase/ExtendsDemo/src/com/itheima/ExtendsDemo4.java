package com.itheima;

public class ExtendsDemo4 {
	public static void main(String[] args) {
		Zi z = new Zi();
		
	}
}
class Fu{
	public  Fu(){
	System.out.println("我是父类的无参构造");	
	}
	public  Fu(int number){
		System.out.println("我是父类的有参构造");
	}
	
}
class Zi extends Fu{
	public Zi(){
		//super(1);
		this(2);
		System.out.println("我是子类的无参构造");	
	}
	public Zi(int number){
		System.out.println("我是子类的有参构造");
	}
	
}