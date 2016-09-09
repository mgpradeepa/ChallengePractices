package com.mgp.hackerrank.ISP.mt.techie.codecontest;

import java.util.ArrayList;
import java.util.List;

public class CandidateCode {
	static int[][] land;

	public static void main(String[] args) {
		Cell c = null;
		int input1[] = { 2, 2 };
		String[] input2 = { "10", "01" };

		System.out.println("Encoded message" + encoded_msg(input1, input2));
	}

	public static int encoded_msg(int[] input1, String[] input2) {
		// Write code here
		land = new int[input1[0]][input1[1]];

		populateLand(input1, input2);
		printArray(land, input1[0], input1[1]);
		int value = findTheLargestPiece(input1, input2);

		return value;
	}

	private static int findTheLargestPiece(int[] input1, String[] input2) {
		// TODO Auto-generated method stub
		int maxSize = 0;
		int currentCell = 0;
		int pickedCell = 0;
		List<Integer> visitingQue = new ArrayList<Integer>();
		for (int i = 0; i < input1[0]; i++) {

			for (int j = 0; j < input1[1]; j++) {
				currentCell = land[i][j];
				int localSize = 0;
				visitingQue.add(currentCell);
				if (visitingQue.size() > 0) {
					for (int h = 0; h < visitingQue.size(); h++) {
						pickedCell = visitingQue.get(h);
						visitingQue.remove(pickedCell);
						if (((i + 1) < input1[0]) && ((j + 1) < input1[1])) {
							visitingQue.add(land[i + 1][j + 1]);
							localSize += 1;
						}

					}

				}
				if (localSize > maxSize) {
					maxSize = localSize;
				}
			}
		}

		return maxSize;
	}

	private static void populateLand(int[] input1, String[] input2) {

		for (int i = 0; i < input2.length; i++) {
			char[] c = input2[i].toCharArray();

			for (int j = 0; j < input1[1]; j++) {
				if (c[j] == '#') {

					land[i][j] = 999;
				} else {

					land[i][j] = Integer.parseInt(String.valueOf(c[j]));
				}

			}

		}
	}

	private static void printArray(int[][] land, int i, int j) {
		// TODO Auto-generated method stub
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				System.out.println(land[a][b]);
			}
		}
	}

}
