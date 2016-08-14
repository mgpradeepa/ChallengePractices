package com.mgp.hackerrank.ISP.booking.com.nl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author mgpradeepa
 *
 */
// findng the pair of numbers which leads to sum called n
// if n then 1 else 0

// 67
// 10
// 18
// 11
// 21
// 28
// 31
// 38
// 40
// 55
// 60
// 62
// 0

public class SumOfNumbernArray {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sx = sc.nextInt();
		int arr[] = new int[sx];

		for (int i = 0; i < sx; i++) {
			arr[i] = sc.nextInt();
		}
		boolean st = false;
		Arrays.sort(arr);
		// System.out.println(arr);

		// actial logic
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == n) {
				st = true;
				break;
			}

			else if (arr[l] + arr[r] < n)
				l++;
			else
				r--;
		}

		if (st)
			System.out.println(1);
		else
			System.out.println(0);

		sc.close();

	}

}
