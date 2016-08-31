package com.mgp.hackerrank.ISP.altimetrik_july;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestClass {
	/* IMPORTANT: Multiple classes and nested static classes are supported */

	/*
	 * uncomment this if you want to read input. import java.io.BufferedReader;
	 * import java.io.InputStreamReader;
	 */
	// 2
	// 4 2 2
	// 1 2
	// 3 4
	// 3 2 2
	// 1 2
	// 1 2

	public static final String THEY_CAN = "They can";
	public static final String THEY_CANT = "They can't";

	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 * 
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine(); int N =
		 * Integer.parseInt(line); for (int i = 0; i < N; i++) {
		 * System.out.println("hello world"); }
		 */

		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.println("Enter the test case ");
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {

			int n = sc.nextInt();
			int p = sc.nextInt();
			int m = sc.nextInt();

			System.out.println(checkPMCan(n, p, m, sc));
		}

	}

	private static String checkPMCan(int n, int p, int m, Scanner sc) {
		String ret = THEY_CANT;
		Set<Integer> pmSet = new HashSet<>();
		int pPens[] = new int[p];
		int mPens[] = new int[m];
		for (int i = 0; i < p; i++) {
			pPens[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			mPens[i] = sc.nextInt();
		}
		int j = 0;
		// for (int i = 0; i < pPens.length || j < mPens.length; i++, j++) {
		// if (pPens[i] > n || mPens[j] > n) {
		// ret = THEY_CANT;
		// } else if (pmSet.add(pPens[i]) && pmSet.add(mPens[i])) {
		// ret = THEY_CAN;
		// }else ret = THEY_CANT;
		// }

		for (int i = 0; i < pPens.length; i++) {
			if (pPens[i] > n) {
				ret = THEY_CANT;
				break;
			}
			if (pmSet.add(pPens[i])) {

				ret = THEY_CAN;
				// break;
			} else {
				ret = THEY_CANT;
				break;
			}
		}
		for (int i = 0; i < mPens.length; i++) {
			if (mPens[i] > n) {
				ret = THEY_CANT;
				break;
			}
			if (pmSet.add(mPens[i])) {
				ret = THEY_CAN;
				// break;
			}

			else {
				ret = THEY_CANT;
				break;
			}
		}

		return ret;

	}
}
