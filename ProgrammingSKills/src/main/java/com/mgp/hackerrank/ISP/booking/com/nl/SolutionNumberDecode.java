package com.mgp.hackerrank.ISP.booking.com.nl;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author mgpradeepa
 */
// Delta encoding : encoded bit = -128 if the number -127 <=
// * x >= 127 Inout: 25626 25757 24367 24267 16 100 2 7277 output : 25626
// * -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275

public class SolutionNumberDecode {

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */

		Scanner sc = new Scanner(System.in);
		String ln = sc.nextLine();
		String[] ls = ln.split(" ");
		int arr[] = new int[ls.length];
		int sol[] = new int[arr.length * 2];
		int tmp[] = new int[arr.length];
		for (int i = 0; i < ls.length; i++) {
			arr[i] = Integer.parseInt(ls[i]);
		}
		sol[0] = arr[0];
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			int s = arr[i] - arr[i - 1];
			tmp[i] = s;
			if (tmp[i] < -127 || tmp[i] > 127) {
				sol[++k] = -128;
				sol[++k] = tmp[i];
			} else {
				sol[++k] = tmp[i];
			}

		}

		for (int i = 0; i <= k; i++) {
			System.out.print(sol[i] + " ");
		}
		sc.close();

	}

}
