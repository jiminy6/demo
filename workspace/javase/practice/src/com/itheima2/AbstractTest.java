package com.itheima2;

public class AbstractTest {
	public static void main(String[] args) {
		JobTeacher jt = new JobTeacher();
		jt.name="hahah";
		BasicTeacher bt = new BasicTeacher();
		bt.name="xixi";
		bt.teach();
		jt.teach();
	}
}
abstract class Teacher{
	String name;
	String gender;
	int age;
	public abstract void teach();
	
}
class BasicTeacher extends Teacher{
	public void teach(){
		System.out.println(name+"来带你们飞");
	}
}
class JobTeacher extends Teacher{
	public void teach(){
		System.out.println(name+"来带你们吃肉");
	}
}