package com.mgp.aoip.ISP.pracstring.E0days;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(factorial(n));
		sc.close();
	}

	private static int factorial(int n) {

		int fact = 1;
		if (n == 1 || n == 0)
			return fact;
		return n * factorial(n - 1);
	}
}
