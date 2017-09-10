package com.itheima;

public class ResumDemo {

	public static void main(String[] args) {
		
	}
	public static int resum(int...arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
