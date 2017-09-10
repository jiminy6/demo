package system;

import java.util.LinkedList;

public class LInkListDemo {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add("hello");
		l.add("world");
		l.addFirst("java");
		System.out.println(l);
	}
}
