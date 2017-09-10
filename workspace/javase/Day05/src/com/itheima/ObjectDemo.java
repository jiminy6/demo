package com.itheima;

import java.util.ArrayList;

public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person("zhansan",12);
		Person p1 = new Person("lisi",11);
		boolean flag=p.equals(p1);
		System.out.println(flag);
		
	}
}
