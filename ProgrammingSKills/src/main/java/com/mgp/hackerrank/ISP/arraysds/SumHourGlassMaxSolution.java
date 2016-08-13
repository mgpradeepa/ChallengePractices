package com.mgp.hackerrank.ISP.arraysds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ip
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 9 2 -4 -4 0
//0 0 0 -2 0 0
//0 0 -1 -2 -4 0

//op 13
public class SumHourGlassMaxSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		// get the hour glass format

		ArrayList<Integer> arl = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2]);
				arl.add(sum);

			}
		}
		System.out.println(arl + " " + Collections.max(arl));
		in.close();

	}
}
