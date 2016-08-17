package com.mgp.hackerrank.ISP.softwareAg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution_Sag_3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = "thisistetest columns";
		String b = "col";
		int n = firstOccurrence(a, b);
		System.out.println(n);
		sc.close();
	}

	static int firstOccurrence(String a, String b) {
		int count = 0;

		Pattern p = Pattern.compile(b);
		Matcher m = p.matcher(a);
		// int count = 0;
		if (m.find()) {
			count = m.start();
		}
		return count;

	}

}
