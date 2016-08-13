package com.mgp.hackerrank.ISP.arraysds;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArraySeqUsingList {

	// this is with using ArrayList
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
//		String ip[] = new String[q];
		int x, y, tag, index;
		int lastAns = 0;
		ArrayList<Integer>[] list = new ArrayList[n];
		while (q-- > 0) {
			tag = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			index = (x ^ lastAns) % n;

			switch (tag) {
			case 1:
				if (list[index] == null) {
					ArrayList<Integer> myList = new ArrayList<>();
					myList.add(y);
					list[index] = myList;
				} else
					list[index].add(y);
				break;
			case 2:
				System.out.println(lastAns = list[index].get(y % list[index].size()));
				break;

			}

		}

		sc.close();

	}
}
