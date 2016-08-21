package data;

import java.text.ParseException;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		DateUtil util=new DateUtil();
		//String str=util.getMonth();
		//System.out.println(str);
		String str=util.convertDateToString(new Date());
		//System.out.println(str);
		//System.out.println(new Date());
		Date date=util.convertStringToDate(str);
		System.out.println(date);
	}
}
