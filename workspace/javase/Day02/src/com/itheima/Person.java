package com.itheima;

import javax.swing.Spring;

/*
 *篮球运动员和教练
	乒乓球运动员和教练
	现在篮球运动员和教练要出国访问,需要学习英语
 */
public class Person {
	String name;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
abstract class Sporter extends Person{
	public abstract void study();
	
}
abstract class Coach extends Person {
	public abstract void teach();
}
class BasSporter extends Sporter  implements LearnEnglish{
	public void study(){
		System.out.println("学打篮球");
	}
	public void speak(){
		System.out.println("我会说外语");
	}
}
class BasCoach extends Coach implements LearnEnglish{
	public void teach(){
		System.out.println("我来教你打篮球");
		
	}
	public void speak(){
		System.out.println("我也会说外语");
	}
}
  class PingSporter extends Sporter {
	 public void study(){
		 System.out.println("我来学乒乓");
	 }
 }
  class PingCoach extends Coach{
	  public void teach(){
		  System.out.println("我来教你打乒乓");
	  }
  }
