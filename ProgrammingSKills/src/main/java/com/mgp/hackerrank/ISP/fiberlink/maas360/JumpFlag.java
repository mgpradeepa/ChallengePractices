package com.mgp.hackerrank.ISP.fiberlink.maas360;

import java.util.Scanner;

public class JumpFlag {

	// k is the heght
	// j is the steps to jump for reaching the flag which is ht k
	// how many jumps u need to have to get the flag.
	// you can only ascend , descend not allowed.
	public static int jump(int k, int j) {
		int res = 0;

		if (k == j)
			res = 1;
		else if (j > k)
			res = 0;
		else {
			for (int i = 0; i < k; i += j) {
				res++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter value for k -> height and j ->  step");
			int k = sc.nextInt();
			int j = sc.nextInt();
			int jbig = (int) Math.exp(j);
			System.out.println(jbig);

			System.out.println(jump(k, j));

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
