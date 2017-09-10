package com.itheima;

public class Changeable {
	public static void main(String[] args) {
		 
	}
	public static int sum(int ...is){
		int sum=0;
		for (int i = 0; i < is.length; i++) {
			sum+=i;
		}
		return sum;
	}
}
