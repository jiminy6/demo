package com.itheima;

public class Demo2 {
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5};
		int max=MyArray.getMax(arr);
		System.out.println(max);
		int index=MyArray.getIndex(arr, 3);
		System.out.println(index);
	}
}
