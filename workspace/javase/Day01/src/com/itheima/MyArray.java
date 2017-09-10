package com.itheima;

public class MyArray {
	private MyArray(){	
		
	}
	public static int getMax(int[]arr){
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	public static int getIndex(int[]arr,int x){
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				index=i;
			}
		}
		return index;
	}
}
