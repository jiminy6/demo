package com.itheima;

public class ExtendsDemo1 {
	public static void main(String[] args) {
		LOL l = new LOL();
		l.start();
		Dota d = new Dota();
		d.start();
		
	}
}
class Game1{
	String name;
	double version;
	public void start(){
		System.out.println("游戏启动了");
	}
	public void closeI(){
		System.out.println("游戏关闭了");
	}
}
class LOL extends Game1{
}
class Dota extends Game1{
	
}
