package com.itheima;
/*
 * "-1 99 4 23";*/
public class SpiltDemo {
	public static void main(String[] args) {
		String s="-1 99 4 23";
		String[]str=s.split(" +");
//		for (int i = 0; i < s.length(); i++) {
//		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
