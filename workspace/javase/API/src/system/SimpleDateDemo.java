package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
	public static void main(String[] args) throws ParseException {
		String birthday="1995-11-17";
		String now="2017-8-10";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//new Date();
		Date d1=sf.parse(birthday);
		Date d2=sf.parse(now);
		long l=d1.getTime();
		long l2=d2.getTime();
		long l3=l2-l;
		System.out.println(l3/60/1000/60/24);
		
		
	}
}
