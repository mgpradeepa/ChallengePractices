package com.mgp.hackerrank.ISP.setOfPrimeNum;

/**
 * 
 */
public class Solution {
	static int count = 0;

	public static void main(String[] args) {
		System.out.println("Hello World IOStreet!");
		System.out.println(getNumberOfPrimes(100));
		// System.out.println(isPrime(3));

	}

	private static int getNumberOfPrimes(int N) {
		for (int i = 2; i < N; i++) {
			if (isPrime(i)) {
				count++;

			}
		}
		return count;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				// System.out.println(n);
				return false;
			}
		}
		return true;
	}
}
