package kr.sangj.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class DateTest {

	public void print() {
		
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(date.getTime());
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("----------------------------------");
		
		GregorianCalendar gc= new GregorianCalendar(date.getYear(),date.getMonth(),date.getDate(),date.getHours(),
				date.getMinutes(),date.getSeconds());
		
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH)+1);		
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(gc.get(GregorianCalendar.HOUR_OF_DAY));
		
		System.out.println("----------------------------------");
		
		SimpleTimeZone stz = new SimpleTimeZone(100000, "none");
		gc.setTimeZone(stz);
		
		SimpleTimeZone stz2 = (SimpleTimeZone) gc.getTimeZone();		
		System.out.println(stz2.getRawOffset());
		
		System.out.println("----------------------------------");
	}
}
