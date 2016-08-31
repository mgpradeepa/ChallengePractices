package com.mgp.hackerrank.ISP.bankbazzar;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * 
 * 
 * @ author mgpradeepa
 * 
 * (X-1)! modulo X = X-1 This can also be expressed as: (X-1)! % X - X-1
 *
 */
public class SolutionFactorialReminder {

	// public static void main(String[] args) throws IOException{
	// Scanner in = new Scanner(System.in);
	// final String fileName = System.getenv("OUTPUT_PATH");
	// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	// int res;
	// int _n;
	// _n = Integer.parseInt(in.nextLine());
	//
	// res = factorialRemainder(_n);
	// bw.write(String.valueOf(res));
	// bw.newLine();
	//
	// bw.close();
	// }

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialRemainder(10000));
	}
// 1000000
	static int factorialRemainder(int n) {
		int cumulativeResult = 0;
		for (int x = 1; x <= n; x++) {
			BigInteger f = factorial(x - 1);
			BigInteger moda = f.mod(BigInteger.valueOf(x));
			int modd= moda.intValue();
			

			if (modd == (x-1))
				cumulativeResult++;

		}

		return cumulativeResult;

	}

	static BigInteger factorial(int n) {
		BigInteger nn = BigInteger.valueOf(n);
		BigInteger f = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           f = f.multiply(new BigInteger(i + ""));
	       }
	       return f;
		
		

	}

}
