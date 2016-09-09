package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner in = new Scanner(System.in);
		String inp = in.next();

		in.close();
		System.out.println(checkWords(inp));

	}

	private static int checkWords(String inp) {
		int result = 0;
		if (inp == null)
			return result;

		char[] allChars = inp.toCharArray();
		for (Character c : allChars) {
			if (Character.isUpperCase(c))
				result++;
		}

		return result + 1;

	}
}
