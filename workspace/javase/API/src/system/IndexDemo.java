package system;

import java.util.ArrayList;
import java.util.List;

public class IndexDemo {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("hello");
		l.add("world");
		l.add("java");
		int i=getIndex(l,"java");
		boolean flag=contain(l,"php");
		System.out.println(flag);
		System.out.println(i);
	}

public static int getIndex(List<String> list,Object other){
	for (int i = 0; i < list.size(); i++) {
	 Object obj=list.get(i);
	if(obj.equals(other)){
		return i;
	}
	}
	return -1;
}
public static boolean contain(List<String> list,Object other){
	int index=getIndex(list,other);
	if(index!=-1){
		return true;
	}
	return false;
}
}