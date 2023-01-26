package com.mgp.hackerrank.ISP.codechef.largeinput;

public class Main {
	// Correct soulution. rann at 177.7M of memory consumption

	public static void main(String[] args) throws java.lang.Exception {
		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		String[] input = bufferedReader.readLine().split(" ");
		int n = java.lang.Integer.parseInt(input[0]);
		int[] karray = new int[n];
		int k = java.lang.Integer.parseInt(input[1]);
		if (k > Math.pow(10, 7)) {
			System.exit(0);
		}
		while (n-- > 0) {

			karray[n] = java.lang.Integer.parseInt(bufferedReader.readLine());
		}

		int count = 0;

		for (int integer : karray) {
			if (integer % k == 0) {
				count++;

			}

		}
		System.out.println(count);
	}
}
