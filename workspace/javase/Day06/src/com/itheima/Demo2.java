package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Collections.swap(list, 0, 1);
		System.out.println(list);
	}
}
