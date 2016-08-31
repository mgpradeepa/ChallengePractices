package com.mgp.hackerrank.ISP.bankbazzar;

public class SolutionZeroOne {

	public static void main(String[] args) {
		System.out.println(Zero_One(120));
	}

	static String Zero_One(int num) {
		int copyOfInput = 0;
		for (int i = 1; i < (num * 100); i++) {

			 copyOfInput = num * i;
			boolean s = check(copyOfInput);
			if(s) break;
			// if (s) {
			
			// }

		}
		return String.valueOf(copyOfInput);
	}

	static boolean check(int n) {
		int coi = n;
		boolean s = true;
		while (coi != 0)

		{
			if (coi % 10 > 1) {
				s = false;
				
			}
			coi = coi / 10;

		}

		return s;

	}
}
