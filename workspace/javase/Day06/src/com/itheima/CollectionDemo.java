package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		List<String> c=new ArrayList<>();
		c.add("hello");
		c.add("world");
		c.add("java");
//		Iterator it=c.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//		for (String string : c) {
//			System.out.println(string);
//		}
		ListIterator<String>lit=c.listIterator();
		while(lit.hasNext()){
			String s=lit.next();
			if(s.equals("java")){
				lit.add("hah");
				
			}
		}
		System.out.println(c);
		
	}
}
