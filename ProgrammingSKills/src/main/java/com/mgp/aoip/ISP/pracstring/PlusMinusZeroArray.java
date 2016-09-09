package com.mgp.aoip.ISP.pracstring;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinusZeroArray {
	// 6
	// -4 3 -9 0 4 1
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		long p = 0;
		long m = 0;
		long z = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] > 0)
				p++;
			if (arr[arr_i] < 0)
				m++;
			if (arr[arr_i] == 0)
				z++;
		}
		in.close();

		// System.out.format("%0.5f%n %0.5f%n %0.5f%n", p / n, m / n, z / n);
		System.out.println(doubleformat((double) p / (double) n) + "\n" + doubleformat((double) m / (double) n) + "\n"
				+ doubleformat((double) z / (double) n));
	}

	private static String doubleformat(double val) {
		return new DecimalFormat("#0.00000").format(val);
	}

}
