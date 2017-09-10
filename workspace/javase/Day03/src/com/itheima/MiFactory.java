package com.itheima;

public class MiFactory {
	public void createPhone(Phone p){
		p.call();
	}
}
class MiNote  implements Phone{
	public void call(){
		System.out.println("小米打电话");
	}
	
}
class RedMi implements Phone{
	public void call(){
		System.out.println("红米打电话");
	}
}

