package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		String s=sf.format(d);
		System.out.println(s);
		Date d1=sf.parse(s);
		System.out.println(d1);
		
	}
}
