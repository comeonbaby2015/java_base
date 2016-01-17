package util;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d = Calendar.getInstance();
		Date date = d.getTime();
		System.out.println(date.toString());

		Calendar d2 = Calendar.getInstance();
		d2.setTime(date);
		System.out.println(d2.toString());
		
		d2.set(Calendar.MONTH, 5);

		System.out.println(d.get(Calendar.YEAR) + "-" + d.get(Calendar.MONTH) + "-" + d.get(Calendar.DAY_OF_MONTH));

		d.set(2014, 10, 5);
		System.out.println(d.get(Calendar.YEAR) + "-" + d.get(Calendar.MONTH) + "-" + d.get(Calendar.DAY_OF_MONTH));

		System.out.println(d.getTime());

		d.add(Calendar.MONTH, -1);
		System.out.println(d.get(Calendar.YEAR) + "-" + d.get(Calendar.MONTH) + "-" + d.get(Calendar.DAY_OF_MONTH));
	}
}
