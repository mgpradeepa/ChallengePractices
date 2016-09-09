package com.mgp.hackerrank.ISP.he.septembereasy16;

import java.util.Scanner;

public class PsychicTupe {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <n; i++) {
			a[i] = sc.nextInt();

		}
		int s = sc.nextInt()-1;
		int e = sc.nextInt();
		sc.close();

		// from s which is an index,
		// get a[s] if a[s] = e then break; return YES
		// else keep hopping
		//
		System.out.println(keepHopping(s, e, a));

	}

	private static String keepHopping(int s, int e, int[] a) {

		int cur = a[s];
		System.out.println("cur -> "+cur);
		if (cur == e) {
			return "Yes";
		}

		return keepHopping(cur-1, e, a);
	}
}
