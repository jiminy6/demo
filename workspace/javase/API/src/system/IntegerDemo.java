package system;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer("10");
		//int a=i.intValue();
		int a=i.parseInt("10");
		System.out.println(a);
		Integer i1 = new Integer(40);
		
		String s=i1.toString();
		System.out.println(s);
		String s2=Integer.toString(20);
		System.out.println(s2);
	}
}
