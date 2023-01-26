package com.mgp.hackerrank.ISP.RiseSmart.se;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "sample";
		System.out.println(checkString(check));

	}

	static String checkString(String input) {
		// .Return value should be "1" if it is palindrome, otherwise "0"
		String rev = "";
		if (null == input) {
			return String.valueOf(0);
		} else if (input.length() == 1) {
			return String.valueOf(1);
		} else {
			// char[] string = input.toCharArray();
			for (int i = input.length() - 1; i > -1; i--) {
				rev = rev + input.charAt(i);
			}
			if (input.equalsIgnoreCase(rev)) {
				return String.valueOf(1);
			} else {
				return String.valueOf(0);
			}

		}

		// return null;
	}

}
