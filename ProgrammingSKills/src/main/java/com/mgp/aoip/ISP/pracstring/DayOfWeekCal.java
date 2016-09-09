package com.mgp.aoip.ISP.pracstring;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeekCal {
	// 08 05 2015
	// year: 2015
	// month: 08
	// date : 05

	public static void main(String[] args) {
		System.out.println("");
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();
		// Calendar c = Calendar.getInstance();
		// c.set(toInt(year), toInt(month)-1,toInt(day));
		Calendar c = new GregorianCalendar(toInt(year), toInt(month) - 1, toInt(day));
		System.out.println(new DateFormatSymbols().getWeekdays()[c.get(Calendar.DAY_OF_WEEK)].toUpperCase());
	}

	private static int toInt(String x) {
		return Integer.parseInt(x);
	}

}
