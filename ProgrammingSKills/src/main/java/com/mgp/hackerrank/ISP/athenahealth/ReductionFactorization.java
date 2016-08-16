package com.mgp.hackerrank.ISP.athenahealth;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReductionFactorization {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int inp = sc.nextInt();
			System.out.println(getreductionFactor(inp));

		} finally {
			sc.close();
		}

	}

	private static int getreductionFactor(int n) {
		int res = 0;
		Set<Integer> in = new TreeSet<Integer>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (in.add(i / j))
					res++;
			}
		}
		return res;

	}
}
