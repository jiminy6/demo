package com.itheima;

public class ExceptionDemo {
	public static void main(String[] args) {
//		try{
//			System.out.println(2/0);
//		}
//		catch(ArithmeticException e){
//			//System.out.println("除数不能为0");
//			//System.out.println(e.printStackTrace(););
//			e.printStackTrace();
//		}
//		System.out.println("hah");
		
//		
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
	}
}
