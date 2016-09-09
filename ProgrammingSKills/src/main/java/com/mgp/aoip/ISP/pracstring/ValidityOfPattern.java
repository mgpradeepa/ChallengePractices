package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidityOfPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			System.out.println(checkPattern(pattern));

		}
		in.close();
	}

	private static String checkPattern(String pat) {
		try {

			Pattern p = Pattern.compile(pat);
			return "Valid";
		} catch (PatternSyntaxException e) {
			return "Invalid";
		}

		// return ret;

	}
}
