package com.mgp.hackerrank.ISP.he.septembereasy16;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * In an array, which consists of N elements, A1, A2, ..., AN, if a subarray has
 * the total number of distinct elements as that of the original array, that
 * determines the presence of Team Rocket.
 * 
 * 
 * figuring out the total number of subarrays having total number of distinct
 * elements same as that of the original array.
 * 
 * @author mgpradeepa
 *
 */
public class NormalType {

	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 * 
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine(); int N =
		 * Integer.parseInt(line); for (int i = 0; i < N; i++) {
		 * System.out.println("hello world"); }
		 */

		// specification:

		// check how many distinct elements are there in the whole given array.
		// how to find:
		// two loops i and j where j goes until i; i and j equal then element is
		// unique.
		// store these ele in Set
		// time to get the sub arrays.
		// each sbarray 1 to 2, 1 to 3, 1 to 4 will have 2 , 3, 4, elements
		// respectively.
		// from the set check

		// specification in solution change:
		// ------------------

		// // check how many distinct elements are there in the whole given
		// array.
		// how to find:
		// two loops i and j where j goes until i; i and j equal then element is
		// unique.
		// in each sub array keep counting the number of unique elements.
		// if I get the number as same as that of whole array then increment
		// rescount by 1

		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int uniqueCount = 0;
		int I = 0, J = 0;
		uniqueCount = getUniquecount(N, A, I, J);
		System.out.println("Main unique " + uniqueCount);

		// check unique counts for each subarray
		int subArrayUniqueCount = 0;
		int totalUnique = 0;
		// for (int i = 0; i < N; i++) { // 1 2 2 1 1
		// int j;
		// for (j = i + 1; j < N; j++) {//
		// if (A[i] == A[j])
		// break;
		//
		// }
		// if (i == j) {
		// subArrayUniqueCount++;
		//
		// }
		// // subArrayUniqueCount = getUniquecount(N, A, i, j);
		// if (subArrayUniqueCount == uniqueCount)
		// totalUnique++;
		//
		// }

		int k =-1;
		for (int i = 0; i < N; i++) {
			int j; ++k;
			for (j = i + 1; j < N; j++) {
				int temp[] = Arrays.copyOfRange(A, i, j + 1);
				subArrayUniqueCount = getUniquecount(temp.length, temp, i, k);
				if (subArrayUniqueCount == uniqueCount)
					totalUnique++;
			}
		}
		System.out.println("Total unique " + totalUnique);

	}

	private static int getUniquecount(int N, int[] A, int I, int J) {
		int totalUniqueCount = 0;
		for (int i = I; i < N; i++) {
			int j;
			for (j = J; j < i; j++) {
				if (A[i] == A[j])
					break;

			}
			if (i == j) {
				totalUniqueCount++;

			}
		}
		return totalUniqueCount;
	}

}
