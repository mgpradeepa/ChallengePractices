package com.mgp.hackerrank.ISP.codechef.ac.potatoes;


public class Main {
	static int numofpotatoes = 0;

	public static void main(String[] args) throws java.io.IOException {

		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < T; i++) {
			String[] input = bufferedReader.readLine().split(" ");
			int x = java.lang.Integer.parseInt(input[0]);
			int y = java.lang.Integer.parseInt(input[1]);
			System.out.println(findPrime(x + y));
		}

	}

	private static int findPrime(int sumOfTwoPlots) {
		numofpotatoes = sumOfTwoPlots;
		int count = 0;
		do {
			numofpotatoes += 1;
			if (isPrime(numofpotatoes)) {
				count++;
				break;
			}

		} while (count++ >= 0);

		return count;
	}

	private static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}
