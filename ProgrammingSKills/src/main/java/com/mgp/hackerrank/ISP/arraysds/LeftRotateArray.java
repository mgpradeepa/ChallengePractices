package com.mgp.hackerrank.ISP.arraysds;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		lefRotate(a, n, d);
		for (int i =0;i<n;i++){
			System.out.print(a[i] + " ");
		}

		sc.close();
	}

	static void lefRotate(int a[], int n, int d) {
		for (int i = 0; i < d; i++)
			lrot1(a, n);
		// return a;

	}

	static void lrot1(int a[], int n) {
		int temp = a[0];
		int i;
		for (i = 0; i < n-1; i++) {
			a[i] = a[i + 1];

		}
		a[i] = temp;
	}
}
