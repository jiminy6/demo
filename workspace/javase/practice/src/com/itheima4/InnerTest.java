package com.itheima4;

public class InnerTest {
	public static void main(String[] args) {
		Outter2 o = new Outter2();
		o.method();
	}
}
interface Inner{
	public void funtion();
}
class Outter2{
	public void method(){
		
	Inner i=new Inner() {
			
			@Override
			public void funtion() {
				System.out.println("funtion");
			}
		};
		i.funtion();
	}
}
