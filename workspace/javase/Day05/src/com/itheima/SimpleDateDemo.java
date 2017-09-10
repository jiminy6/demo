package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日HH时");
		Date d = new Date();
		String s1=s.format(d);
		System.out.println("   xxxxxxxxxxxxxxxxxx");
		System.out.println(s1);
		Date d1=s.parse(s1);
		System.out.println(d1.toLocaleString());
		
	}
}
