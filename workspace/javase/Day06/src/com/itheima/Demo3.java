package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("haha");
		list.add("xix");
		list.add("laal");
		//Collections.shuffle(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
