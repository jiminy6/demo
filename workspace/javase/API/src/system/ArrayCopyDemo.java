package system;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		//static void arraycopy
		int[]src={1,2,3,4,5};
		 int[]dest=new int[5]; 
		 System.arraycopy(src, 0, dest, 0,5);
		  for (int i = 0; i < dest.length; i++) {
			//System.out.print(dest[i]);
		double a=	System.currentTimeMillis();
		System.out.println(a);
		}
	}
}
