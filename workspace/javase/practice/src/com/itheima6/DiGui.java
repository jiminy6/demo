package com.itheima6;

public class DiGui {
	public static void main(String[] args) {
		int a=JC(5);
		System.out.println(a );
	}
	public static int JC(int a){
		if(a==1){
			return 1;
		}
		else{
			return a*JC(a-1);
		}
	}
}
