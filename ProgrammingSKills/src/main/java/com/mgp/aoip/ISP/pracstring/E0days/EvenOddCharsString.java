package com.mgp.aoip.ISP.pracstring.E0days;

import java.util.Scanner;

public class EvenOddCharsString {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		// take number of words
		// take that many number of strings
		Scanner sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.nextLine());

		while (t-- > 0) {
			char[] charArray = sc.nextLine().toCharArray();
			char[] evenChar = new char[charArray.length];
			char[] oddChar = new char[charArray.length];
			int even = 0;
			int odd = 0;
			int j = 0;
			for (int i = 0; i < charArray.length; i++, j++) {
				if (i % 2 == 0) {
					evenChar[even++] = charArray[i];
				} else {
					oddChar[odd++] = charArray[i];
				}
			}
			String evenStr = String.valueOf(evenChar);
			String oddStr = String.valueOf(oddChar);
			System.out.println(evenStr.trim() + "  " + oddStr.trim());

		}

		sc.close();
	}
}
