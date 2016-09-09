package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int arr[] = new int[n];

		long sum = 0L;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);

		System.out.println(sum);
		sc.close();
	}

}
