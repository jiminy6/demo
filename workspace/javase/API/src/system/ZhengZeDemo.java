package system;

public class ZhengZeDemo {
	public static void main(String[] args) {
		String qq="baq";
//		boolean flag=qq.matches("[1-9][0-9][4-14]");
//		System.out.println(flag);
		boolean flag=Check1(qq);
		System.out.println(flag);
	}
	public static boolean Check(String s){
		s.toLowerCase();
		char ch=s.charAt(2);
		String str="aeiou";
		return str.contains(ch+"");
	}
	public static boolean Check1(String s){
		s.toLowerCase();
		return s.matches("\\w[aeiou]\\w");
	}
}
