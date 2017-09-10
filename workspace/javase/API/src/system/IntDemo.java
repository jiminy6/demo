package system;

public class IntDemo {
	public static void main(String[] args) {
		int x=10;
		if(x>=Math.pow(-2, 31)&&x<=Math.pow(2, 32)-1){
			System.out.println("符合");
		}
		else {
			System.out.println("不符合");
		}
	}
}
