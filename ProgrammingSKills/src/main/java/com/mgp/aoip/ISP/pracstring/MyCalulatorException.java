package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;

public class MyCalulatorException {
	public final String EXCEPTION = "n and p should be non-negative";

	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throwException(EXCEPTION);
//		System.out.println((int) Math.pow(n, p));

		Double val = new Double(Math.pow(n, p));

		// return Integer.valueOf(val.intValue());
		return (int) Math.pow(n, p);

	}

	void throwException(String s) throws Exception {
		throw new Exception(s);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" ");

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalulatorException my_calculator = new MyCalulatorException();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

class Solutionx {

	// public static void main(String[] args) {
	// Scanner in = new Scanner(System.in);
	// System.out.println(" ");
	//
	// while (in.hasNextInt()) {
	// int n = in.nextInt();
	// int p = in.nextInt();
	// MyCalulatorException my_calculator = new MyCalulatorException();
	// try {
	// System.out.println(my_calculator.power(n, p));
	// } catch (Exception e) {
	// System.out.println(e);
	// }
	// }
	// }
}
