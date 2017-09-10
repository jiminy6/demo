package com.itheima;

public class DuoTai {
	public static void main(String[] args) {
		MiFactory f = new MiFactory();
		f.createPhone(new MiNote());
		f.createPhone(new RedMi());
		
	}
}
