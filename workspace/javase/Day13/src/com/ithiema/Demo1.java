package com.ithiema;

import java.lang.reflect.Field;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, ReflectiveOperationException, ReflectiveOperationException {
		Class clazz=Class.forName("com.ithiema.Student");
		Object stu=clazz.newInstance();
		Field f=clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(stu, "lili");
		System.out.println(f.get(stu));
		//zhenshidiaobaolehaahahdajgsjansa;dksagjsakl;gsakgsajkgsajgsal;jgs;lagjsal;gjl;skd
		
	}
}
