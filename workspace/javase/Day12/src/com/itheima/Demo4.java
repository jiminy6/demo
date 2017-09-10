package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("com.itheima.Student");
		Constructor c = clazz.getConstructor(String.class, int.class);
		System.out.println(c);
		Object obj = c.newInstance("lisi", 20);
		System.out.println(obj);

	}

}
