package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import javax.sound.sampled.Line;

public class CollectionDemo {
	public static void main(String[] args) {
//		List <Integer> l = new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		int index=Collections.binarySearch(l, 2);
//		System.out.println(index);
//		Collections.fill(l, "4");
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//Collections.fill(list, "hah");
		Collections.shuffle(list);
		System.out.println(list);
	}
}
