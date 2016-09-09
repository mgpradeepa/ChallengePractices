package com.mgp.aoip.ISP.pracstring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingIntegerTypes {

	public static void main(String[] args) throws InputMismatchException, ArithmeticException {
		System.out.println("   ");
		Scanner sc = new Scanner(System.in);
		try {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());

			int val = x / y;
			System.out.println(val);

		} catch (NumberFormatException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
			// throw new ArithmeticException("/ by zero");
		} finally {
			sc.close();
		}

	}
}
