package com.mgp.hackerrank.ISP.arraysds;

import java.util.Scanner;

public class DynamicArraySeqUsing2DArray {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		// String ip[] = new String[q];
		int x, y, cmd, c, len;
		int lastAns = 0;
		int A[][] = new int[n][];
		int temp[];

		for (int k = 0; k < q; ++k) {
			cmd = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			c = (x ^ lastAns) % n;

			switch (cmd) {
			case 1:
				if (A[c] == null)
					len = 1;
				else
					len = A[c].length + 1;
				temp = new int[len];

				if (A[c] != null)
					System.arraycopy(A[c], 0, temp, 0, A[c].length);
				temp[temp.length - 1] = y;
				A[c] = temp;

				break;

			case 2:
				System.out.println(lastAns = A[c][y % A[c].length]);
				break;
			}

		}

		sc.close();
	}
}
