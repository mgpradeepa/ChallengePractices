package com.mgp.hackerrank.ISP.missingnumberinArithProgression;

import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		System.out
				.println("Enter the progression and the total numbers inthe progression");
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the seq");
		String s = sc.nextLine();
		System.out.println("s: " + s);
		String[] it = s.split(" ");

		int[] ap = new int[it.length];

		for (int i = 0; i < it.length; i++) {
			ap[i] = Integer.parseInt(it[i]);
			System.out.println(ap[i]);
		}

		// findMissingAP(ap, N);
		apalgo(ap, N);

		sc.close();

	}

	/*
	 * private static void findMissingAP(int[] ap, int n) { if (n < 3) throw new
	 * RuntimeException("n cannot be less than 3");
	 * 
	 * int average = (ap[0] + ap[ap.length - 1]) / 2; int actualSum = 0;
	 * 
	 * for (int i : ap) { actualSum += i;
	 * 
	 * } System.out.println("Mssing is :: " + (average * n - actualSum)); }
	 */
	private static void apalgo(int[] ap, int n) {
		if (n < 3)
			throw new RuntimeException("n cannot be less than 3");

		int sumOfN = (n + 1) * (ap[0] + ap[ap.length - 1]) / 2;
		int acS = 0;
		for (int i : ap) {
			acS += i;
			System.out.println("acs" + acS);

		}
		System.out.println("Mis : " + (sumOfN - acS));

	}
}
