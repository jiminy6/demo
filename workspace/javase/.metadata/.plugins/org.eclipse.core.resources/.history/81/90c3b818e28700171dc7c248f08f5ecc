package com.itheima;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 定义一个Student类,里面包含name和age属性 创建三个学生对象,分别为学生的姓名和年龄赋值 
 * 然后将这三个学生对象放入HashSet集合 遍历HashSet集合,打印每个学生的姓名和年龄 
 * 
 * */
public class Demo {
	public static void main(String[] args) {
		Student s = new Student("xxxx",12);
		Student s1 = new Student("xxsds",223);
		Student s2 = new Student("ds",223);
		Student s3 = new Student("ds",223);
		Set<Student> set = new HashSet<>();
		set.add(s2);
		set.add(s1);
		set.add(s);
		set.add(s3);
		Iterator<Student> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
class Student {
	private String neme;
	private int age;
	public  Student() {
	}
	public  Student(String neme, int age) {
		super();
		this.neme = neme;
		this.age = age;
	}
	public String getNeme() {
		return neme;
	}
	public void setNeme(String neme) {
		this.neme = neme;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((neme == null) ? 0 : neme.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (neme == null) {
			if (other.neme != null)
				return false;
		} else if (!neme.equals(other.neme))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [neme=" + neme + ", age=" + age + "]";
	}
	
	
}