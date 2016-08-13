package com.mgp.hackerrank.RR.challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/***
 * 
 * @author mgpradeepa
 *
 */
/**
 * 
 * Login time of the drivers during peak time and idle time separately.
 * 
 * Given: t1 to t2 => peak time li => login time lo => logout time
 * 
 * To find: Amount of time the driver is logged on during peak time Meaning
 * total time considering li and lo check how many hours/seconds he is logged in
 *
 */
public class PeakTimeLoginDriver {
	/**
	 * Analysis towards the solution steps Say t1 and t2 are some numbers (time)
	 * t1 < t2 Login and Logouts are also numbers which can be n- times --- li
	 * and lo (li < lo)
	 * 
	 * li >= t1 [ only to be considered] AND lo < t2 || lo > t2 [ only to be
	 * considered]
	 * 
	 * Amount of time the driver was logged in to be calculated
	 * 
	 */

	/* t1=> peak time start */
	public static Double t1;

	/* t2=> peak time end */
	public static Double t2;

	/* li=> login time */
	public static Double li1;

	/* lo=> logout time */
	public static Double lo1;

	/* li=> login time */
	public static Double li2;

	/* lo=> logout time */
	public static Double lo2;

	/* li=> login time */
	public static Double li3;

	/* lo=> logout time */
	public static Double lo3;

	public static Double amtTimeLogged = 0.00;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		t1 = 9.0;
		t2 = 10.0;
		li1 = 9.0;
		lo1 = 9.5;
		li2 = 9.6;
		lo2 = 9.7;
		li3 = 9.9;
		lo3 = 10.5;

		//
		// LoggedDriver driver = new LoggedDriver();
		// driver.setLoginTime(li);
		// driver.setLogoutTime(lo);

		// addressing race conditions
		if (t1 > t2 || li1 > lo1 || li1 > t2 || li2 > lo2 || li2 > t2 || li3 > lo3 || li3 > t2)
			return;
		else {
			lo1 = Math.min(lo1, t2);
			lo2 = Math.min(lo2, t2);
			lo3 = Math.min(lo3, t2);

			amtTimeLogged += (lo1 - li1) + (lo2 - li2) + (lo3 - li3);

		}

		System.out.println("total amount of time logged in " + String.format("%.2f", amtTimeLogged));

		String time = "23:55";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date d = sdf.parse(time);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, 75);
		

		String newTime = sdf.format(cal.getTime());
		System.out.println(newTime);
		
		System.out.println("Chekker date " + maxDate(d, cal.getTime()));

	}
	
	public static  Date maxDate (Date d1, Date d2) {
		if (d1 == null || d2 == null) return null;
		if(d1 == null)  return d2;
		if (d2 == null ) return d1;
		Date dd = (d1.after(d2)) ? d1 : d2;		
		return dd;
	}

}
