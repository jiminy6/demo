package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class MoNIFaPai {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		String[]color={"梅花","方块","红桃","黑桃"};
		String[]num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < num.length; j++) {
				array.add(color[i]+num[j]);
			}
		}
		array.add("大王");
		array.add("小王");
		Collections.shuffle(array);
//		for (int i = 0; i < array.size(); i++) {
//			System.out.print(array.get(i)+ " "+i+" ");
//		}
		ArrayList<String> 孙逗比 = new ArrayList<>();
		ArrayList<String> 张逗比 = new ArrayList<>();
		ArrayList<String> luo = new ArrayList<>();
		for (int i = 0; i <array.size()-3; i++) {
			if(i%3==0){
				luo.add(array.get(i));
			}
			else if(i%3==1){
				孙逗比.add(array.get(i));
			}
			else if(i%3==2){
				张逗比.add(array.get(i));
				
			}
		}
		System.out.println("孙逗比:"+孙逗比);
		System.out.println("张逗比："+张逗比);
		System.out.println("luo:"+luo);
		for (int i =array.size()-3; i <array.size(); i++) {
			System.out.println("底牌："+array.get(i));
		}
		
		
	}
}
