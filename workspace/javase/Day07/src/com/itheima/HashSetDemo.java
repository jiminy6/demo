package com.itheima;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("world");
		set.add("java");
		for (String string : set) {
			System.out.println(string);
		}
//		Iterator<String> i=set.iterator();
//		while(i.hasNext()){
//		System.out.println(i.next() );
//		}
	}
}
