package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;

// 24 hr format times no AM and PM for a given 07:05:45PM as 19:05:45
public class ConvertToMilitarytime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		sc.close();

		// ---- specification

		// check PM or AM which is at the end of the string.
		// add 12 to the given number in hh place.
		// if sums to 24 and AM then make it to 0

		String pm_am = time.substring(8, 10);
		String hh = time.substring(0, 2);
		String newhh = "";
		int nhh = 0;
		if (pm_am.equals("PM")) {

			if (hh.equals("12"))
				nhh = 12;
			else

				nhh = Integer.parseInt(hh) + 12;

			newhh = String.valueOf(nhh);

		} // AM
		else {

			if (Integer.parseInt(hh) + 12 == 24)
				newhh = "00";
			else

				newhh = String.valueOf(hh);
		}
		// replace all hh with newhh and append the rest of the string and
		// remove the PM or AM

		String militaryTime = time.replace(time.substring(0, 2), newhh).replace("PM", "").replace("AM", "");// +
																											// time.substring(3,
																											// 8);

		System.out.println("Military time " + militaryTime);
	}
}
