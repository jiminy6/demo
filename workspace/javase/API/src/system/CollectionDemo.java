package system;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		//Collection c=new ArrayList();
		//List c=new ArrayList();
	//	List c=new ArrayList();
		List<String> c=new ArrayList<String>();
		c.add("hellow");
		c.add("xixi");
		c.add("java");
		ListIterator <String>it=c.listIterator();
		while(it.hasNext()){
			String s=(String) it.next();
			if(s.equals("java")){
				it.add("haha");
			}	
		}
		System.out.println(c);
	}
}
