package com.mgp.hackerrank.ISP.onmobile;

import java.util.Scanner;

/***
 * 
 * @author mgpradeepa
 * 
 *         For a given string find the anagrams and check of there are any
 *         palindrome possible of that String
 * 
 *         Steps to follow: Find all the possible anagrams of the String Check
 *         each of these having the palindrome format or not
 *
 */
public class AnagramPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inp = sc.next();
		sc.close();
		System.out.println("Named input " + inp);
		String output = checkAnaagramPalindrome(inp);

		System.out.println("Final output = " + output);
	}

	private static String checkAnaagramPalindrome(String inp) {

		String op = "";
		String[] anagramArray = getAnagrams(inp);
		for (String ss : anagramArray) {
			if (findPalindrome(ss)) {
				op = "Yes";
			} else
				op = "No";
		}
		return op;
	}

	private static boolean findPalindrome(String ss) {
		int len = ss.length();
		int i = 0;
		for (i = 0; i < len / 2; i++) {
			if (ss.charAt(i) != ss.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

	private static String[] getAnagrams(String inp) {
		int i = 0;
		String[] permutables = new String[factorial(inp.length()) - 1];

		// String perm =
		permuted(inp, 0, inp.length() - 1, permutables);
		// permutables[i++] = perm;

		return permutables;
	}

	private static int factorial(int sizeed) {
		int size = sizeed;

		for (int i = (size - 1); i > 1; i--) {
			size = size * i;
		}
		return size;

	}

	private static String[] permuted(String inp, int s, int e, String[] permutedAnagrams) {
		int i = 0;
		int j = 0;
		if (s == e) {
			System.out.println("in if loop");
			display(permutedAnagrams);
			return permutedAnagrams;
		}
		// else {
		for (i = s; i <= e; i++) {
			// swap the characters
			char temp = inp.charAt(i);
			char temp2 = inp.charAt(s);

			inp = inp.substring(0, s) + temp + inp.substring(s + 1);
			inp = inp.substring(0, i) + temp2 + inp.substring(i + 1);

			permuted(inp, s + 1, e, permutedAnagrams);
			System.out.println("88*** " + inp);
			permutedAnagrams[j++] = inp;

			temp = inp.charAt(i);

			temp2 = inp.charAt(s);

			inp = inp.substring(0, s) + temp + inp.substring(s + 1);
			inp = inp.substring(0, i) + temp2 + inp.substring(i + 1);
		}
		// }
		System.out.println("permuted Method  op");
		display(permutedAnagrams);
		return permutedAnagrams;
	}

	private static void display(String[] permutedAnagrams) {
		// TODO Auto-generated method stub

		for (String s : permutedAnagrams) {
			System.out.println(s);
		}
	}

}
