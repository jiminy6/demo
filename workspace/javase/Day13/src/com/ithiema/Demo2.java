package com.ithiema;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) throws Exception, SecurityException {
		Person p = new Person();
//		
//		MybeanUtlis.setProperty(p,"name", "wang");
		Map map = new HashMap();
		map.put("name", "haha");
		map.put("age",11);
		map.put("gender", "man");
		map.put("birthday", 11);
		MybeanUtlis.populate(p, map);
		
		System.out.println(p);

	}

}
