package com.mgp.hackerrank.ISP.softwareAg;

import java.util.Arrays;

/**
 * 
 * @author mgpradeepa
 *
 */
// find the count of the duplicates numbers in the given string
public class Solution_Sag_1 {
	public static void main(String[] args) throws Exception {
		// Scanner sc = new Scanner(System.in);
		// int n[] = { 1, 3, 1, 4, 5, 6, 3, 2, 1 };
		// int n [] = {1,1,2,2,3,2};
		// int n[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 9 };
		int n[] = { 1, 2, 3, 4, 1 };
		System.out.println(countDuplicates(n));
		System.out.println(mydup(n));

		// sc.close();
	}

	//
	static int countDuplicates(int[] numbers) {
		Arrays.sort(numbers);
		int numDup = 0, dupCount = 0;
		int previous = -1;
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] == previous) {
				++numDup;
				if (numDup == 1) {
					++dupCount;
					//
				}
			} else {
				previous = numbers[i];
				numDup = 0;
			}
		}
		return dupCount;
	}

	// different approach, by using more space .
	static int mydup(int n[]) {
		Arrays.sort(n);

		int lasnum = n[n.length - 1];
		int cnt = 0;
		int eachcnt = 0;
		int[] p = new int[lasnum + 1];
		Arrays.fill(p, -999);
		int s = -1;
		for (int i = 0; i < n.length; i++) {

			int k = n[i];
			if (k != s) {
				eachcnt = 0;
				s = n[i];
				eachcnt++;
			} else
				eachcnt++;

			if (p[k] == -999) {
				p[k] = k;
			} else if (p[k] == k && (eachcnt > 2)) {
				continue;
			} else
				cnt++;
		}
		return cnt;

	}

}
