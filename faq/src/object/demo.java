package object;

import java.util.Calendar;
import java.util.Date;

public class demo {
	public static void main(String[] args) {
		// demo1();
		// demo3();
		demo5();
	}

	public static void demo1() {
		Calendar c = Calendar.getInstance();
		// c.set(Calendar.YEAR, 2015);
		// c.set(Calendar.MONTH, 0);
		// c.set(Calendar.DAY_OF_MONTH, 31);
		System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH) + "  " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":"
				+ c.get(Calendar.SECOND));

	}

	public void demo2() {
		double d = 1256.22d;
		// d = d / 100;
		System.out.println(Math.round(d));
	}

	public static void demo3() {
		Date dat = new Date();
		long now = dat.getTime();
		System.out.println(now);
	}

	public static void demo4() {
		short s1 = 1;
		// s1 = (short) (s1 + 1);
		s1 += 1;
	}

	public static void demo5() {
		System.out.println(2 << 3);
	}
}
