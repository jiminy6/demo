package com.itheima;

public class ClassDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Teacher t = new Teacher();
		Class clalzz=t.getClass();
		Class clazz2=Teacher.class;
		Class clazz3=Class.forName("com.itheima.Teacher");
	}
}
