package com.itheima3;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		 BasPlayer b = new BasPlayer();
		 b.speak();
		 BasCoach bc = new BasCoach();
		 bc.speak();
		 bc.name="haha";
	}
}
class Person{
	String name;
	int age;
	String gender;

	public Person() {
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void eat(){
		System.out.println("我要吃肉");
	}
	public void sleep(){
		System.out.println("我要睡觉");
	}
	
}
abstract class Player extends Person {
	public void study(){
		 
	}
}
abstract class Coach extends Person{
	public void teach(){
		
	}
}
class BasPlayer extends Player implements SpeakEnglish{
	public void study(){
		System.out.println("扣篮");
	}
	public void speak(){
		System.out.println("我会说英语");
	}
}
class PPPlayer extends Player{
	public void study(){
		System.out.println("打乒乓球");
	}
}
class BasCoach extends Coach implements SpeakEnglish{
	public void teach(){
		System.out.println("教扣篮");
	}
	public void speak(){
		System.out.println("我会说英语");
	}
}
class PPCoach extends Coach{
	public void teach(){
		System.out.println("教乒乓");
	}
}
interface SpeakEnglish{
	 void speak();
}