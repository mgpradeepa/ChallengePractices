package com.mgp.hackerrank.ISP.he.septembereasy16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * find total number of unique pairs Ai, Aj such that i < j
 * 
 * @author mgpradeepa
 *
 */
public class ElectricType {
	public static void main(String[] args) {
		// specfication:

		// i for loop
		// j for loop
		// for each of i run next of each j
		// with the values obtained create a string and load into Set/ TreeSet
		// for each add get the count and that should be the unique number of
		// possible unique pairs
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		// intitalize Set
		Set<String> pairs = new HashSet<String>();

		int uniqueCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String pair = String.valueOf(a[i]) + "_" + String.valueOf(a[j]);
				if (pairs.add(pair)) {
					uniqueCount++;
				}
			}
		}
		System.out.println(uniqueCount);

	}
}
