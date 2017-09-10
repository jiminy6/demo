package system;

import java.util.ArrayList;
import java.util.Collection;

public class ForSuper {
	public static void main(String[] args) {
		Collection<String > c = new ArrayList<String>(); 
		c.add("你好呀");
		c.add("李银河");
		c.add("王小波");
//		for(String s:c){
//			System.out.println(c);
//		}
		for (String string : c) {
			System.out.println(c);
		}
	}
}
