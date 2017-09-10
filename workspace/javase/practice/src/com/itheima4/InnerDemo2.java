package com.itheima4;

import com.itheima4.Outter.Inner;

public class InnerDemo2 {
	public static void main(String[] args) {
		Outter.Inner i = new Outter().new Inner();
	}
}
class Outter{
	private int num=10;
	public void method(){
		Inner i = new Inner();
		i.function();
	}
	class Inner{
		public void function(){
			System.out.println(num);
		}
	}
}
