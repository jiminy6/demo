package com.itheima4;

import com.itheima4.Outter.Inner;

public class InnerDemo {
	public static void main(String[] args) {
		//Inner inner = new Outter.Inner();
		Outter.Inner i = new Outter().new Inner();
	}
}
class Outter1{
	private int num=10;
	public void method(){
		Inner i = new  Inner();
		i.function();
	}
	class Inner{
		public void function(){
		System.out.println(num);
		}
	}
	
}
