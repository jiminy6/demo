package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDizhu {
	public static void main(String[] args) {
		String []str={"黑桃","红桃","方块","梅花"};
		String[]str1={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				list.add(str[i]+str1[j]);
			}
		}
		list.add("大王");
		list.add("小王");
	Collections.shuffle(list);
	List<String> list1 = new ArrayList<>();
	List<String> list2 = new ArrayList<>();
	List<String> list3 = new ArrayList<>();
	for (int i = 0; i < list.size()-3; i++) {
		if(i%3==0){
			list1.add(list.get(i));
			
		}
		else if(i%3==1){
			list2.add(list.get(i));
		}
		else if(i%3==2){
			list3.add(list.get(i));
		}
	}
	List<String> list4 = new ArrayList<>();
	for (int i =list.size()-3; i < list.size(); i++) {
		list4.add(list.get(i));
	}
	Collections.sort(list1);
	Collections.sort(list4);
	Collections.sort(list3);
	Collections.shuffle(list2);
	System.out.println("农民1"+list1);
	System.out.println("农民2"+list2);
	System.out.println("地主"+list3);
	System.out.println("底牌"+list4);
	}
}
