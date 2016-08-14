package com.mgp.hackerrank.ISP.fibgcd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	private static void findanswer(long data) {

		/* Initialization */

		int sqroot = (int) Math.sqrt(data), flag, itr = 0;
		long[] array = new long[sqroot];
		long div = 2;
		long temp, sum;

		/* Find All the Factors of Random Number */

		while (div <= data) {
			if (data % div == 0) {
				array[itr++] = div;
			}
			div++;
		}
		div = 0;
		sum = 1;
		flag = 0;

		/*
		 * Check for each fibonacci number , if it is divisble by the factors
		 * found in earlier step
		 */

		while (true) {
			temp = sum;
			sum += div;
			div = temp;
			for (int i = 0; i < itr; i++) {
				if (sum % array[i] == 0) {
					System.out.println(sum + " " + array[i]);
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		long[] array = new long[N];
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			array[i] = Long.parseLong(line);
		}
		for (int i = 0; i < N; i++) {
			findanswer(array[i]);
		}
	}
}
