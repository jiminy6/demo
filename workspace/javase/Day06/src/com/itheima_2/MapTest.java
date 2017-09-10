package com.itheima_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String,List<Student>> hm = new HashMap<String,List<Student>>();
		List<Student>base=new ArrayList<Student>() ;
		base.add(new Student("01","hah"));
		base.add(new Student("02","xixi"));
		List<Student>job=new ArrayList<Student>() ;
		job.add(new Student("01","h"));
		job.add(new Student("02","x"));
		 hm.put("基础",base);
		 hm.put("就业", job);
		 Set<Map.Entry< String,List<Student>>> entrys=hm.entrySet();
		 for (Map.Entry<String, List<Student>> entry : entrys) {
			String key=entry.getKey();
			System.out.println("班级："+key);
			List<Student> value=entry.getValue();
			for (Student student : value) {
				System.out.println(student);
			}
		}
		 
		
	}
}
