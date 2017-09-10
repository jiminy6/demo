package com.itheima;

public class YuanYin {
	public static void main(String[] args) {
		//String s="aeiou";
		String s="qab";
		boolean flag= check(s);
		System.out.println(flag);
		
	}
	public static boolean check(String s){
	s.toLowerCase();
	return s.matches("\\w[aeiou]\\w");
	}
}
