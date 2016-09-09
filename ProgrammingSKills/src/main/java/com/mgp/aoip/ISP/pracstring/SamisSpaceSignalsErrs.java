package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Explanation
 * 
 * Sample 0
 * 
 * S = SOSSPSSQSSOR, and signal length |S| = 12 . Sami sent 4 SOS messages
 * (i.e.: 12/3 =4 ).
 * 
 * Expected signal: SOSSOSSOSSOS Recieved signal: SOSSPSSQSSOR
 * 
 * We print the number of changed letters, which is  3.
 * 
 * Sample 1
 * 
 * S= SOSSOT, and signal length . Sami sent 2 SOS messages (i.e.: 6/3=2).
 * 
 * Expected Signal: SOSSOS Received Signal: SOSSOT
 * 
 * We print the number of changed letters, which is 1.
 * 
 * @author mgpradeepa
 *
 */
public class SamisSpaceSignalsErrs {
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();
		System.out.println(countErrSignals(S));

	}

	private static int countErrSignals(String signal) {
		int wrongSignals = 0;

		Pattern pat = Pattern.compile("[^SOS]");
		Matcher mat = pat.matcher(signal);
		while (mat.find()) {
			wrongSignals++;
		}
		return wrongSignals;
	}

}
