package system;

import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
	Calendar c=Calendar.getInstance();
	c.add(Calendar.DAY_OF_MONTH,10);
	int year=c.get(Calendar.YEAR);
	int month=c.get(Calendar.MONTH);
	int day=c.get(Calendar.DAY_OF_MONTH	);
	
	//System.out.println(Calendar.DAY_OF_MONTH);
	System.out.println(year);
	System.out.println(year+"年"+(month+1)+"月"+day+"日");
	}
}