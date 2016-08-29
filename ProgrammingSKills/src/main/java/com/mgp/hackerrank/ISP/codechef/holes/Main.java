package com.mgp.hackerrank.ISP.codechef.holes;

public class Main {

	public static void main(String[] args) throws java.io.IOException {

		java.io.BufferedReader br = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));

		int testcases = Integer.parseInt(br.readLine());

		while (testcases-- > 0) {
			String s = br.readLine();
			checkForWholes(s);
		}

	}

	private static void checkForWholes(String s) {

		char[] carr = s.toCharArray();
		int count = 0;
		for (char c : carr) {
			switch (c) {
			case 'A':
			case 'D':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
				count++;

				break;

			case 'B':
				count += 2;
				break;
			}

		}

		System.out.println(count);
	}

}
