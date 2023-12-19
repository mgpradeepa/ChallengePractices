package com.mgp.aoip.ISP.pracstring;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {

		return sortString(a).equalsIgnoreCase(sortString(b));

	}

	static String sortString(String s) {
		char[] c = s.toCharArray();
		char[] newc = new char[c.length];
		int i = 0;
		for (Character cc : c) {
			newc[i++] = Character.toLowerCase(cc);
		}
		Arrays.sort(newc);
		// System.out.println("as chrs"+String.valueOf(newc));
        // System.out.println("sortstrng"+sortS);
		return new String(newc);
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
