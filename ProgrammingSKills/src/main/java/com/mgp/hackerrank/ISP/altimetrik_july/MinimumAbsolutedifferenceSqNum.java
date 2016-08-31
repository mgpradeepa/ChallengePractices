package com.mgp.hackerrank.ISP.altimetrik_july;

/**
 * 
 * @author mgpradeepa Given an integer T T, number of test cases. For each test
 *         case: In the first line: given an integer Q Q, the number of queries.
 *         Then next Q Q lines follow, each line has an integer N N.
 */
public class MinimumAbsolutedifferenceSqNum {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the values for T,\n Q-> num of queries each ofQ numbe f lines has integers");
		int T = Integer.parseInt(sc.nextLine());
		while (T-- > 0) {

			int Q = Integer.parseInt(sc.nextLine());
			while (Q-- > 0) {
				System.out.println(getMinAbsolutediffFromSqNumb(Integer.parseInt(sc.nextLine())));
			}
		}

	}

	private static int getMinAbsolutediffFromSqNumb(int n) {
		if (specialNumber(n))
			return 0;

		return checkAbsoluteDiff(n);
	}

	private static int checkAbsoluteDiff(int n) {
		int posCount = checkFwdAbsolute(n);
		int beforeCount = checkBwdAbsolute(n);

		return Math.min(posCount, beforeCount);
	}

	private static int checkBwdAbsolute(int n) {
		int temp = n;
		int bwCount = 0;
		while (!specialNumber(temp)) {
			bwCount++;
			temp--;

		}
		System.out.println("backwordCount = " + bwCount);
		return bwCount;
	}

	private static int checkFwdAbsolute(int n) {
		int temp = n;
		int fwdCount = 0;
		while (!specialNumber(temp)) {
			fwdCount++;
			temp++;

		}
		System.out.println("forwordCount = " + fwdCount);
		return fwdCount;
	}

	// for all y raised to power on x and check if its greater than or equal to
	// n
	private static boolean specialNumber(int n) {
		if (n == 1)
			return true;
		for (int x = 2; x <= Math.sqrt(n); x++) {
			int p = x;
			while (p <= n) {
				p *= x;
				if (p == n)
					return true;
			}

		}

		return false;
	}
}
