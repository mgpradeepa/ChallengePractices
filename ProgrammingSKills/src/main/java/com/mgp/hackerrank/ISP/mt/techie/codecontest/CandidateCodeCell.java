package com.mgp.hackerrank.ISP.mt.techie.codecontest;

import java.util.ArrayList;
import java.util.List;

public class CandidateCodeCell {
	static Cell[][] land = null;

	public static void main(String[] args) {
		// int input1[] = { 2, 2 };
		// String[] input2 = { "10", "01" };
		int input1[] = { 1, 1 };
		String[] input2 = { "1" };

		System.out.println("Encoded message" + encoded_msg(input1, input2));
	}

	public static int encoded_msg(int[] input1, String[] input2) {
		// Write code here
		int value = 0;
		land = new Cell[input1[0]][input1[1]];// int[input1[0]][input1[1]];

		populateLand(input1, input2);
		// printArray(land, input1[0], input1[1]);
		value = findTheLargestPiece(input1, input2);

		return value;
	}

	private static int findTheLargestPiece(int[] input1, String[] input2) {
		// TODO Auto-generated method stub
		int maxSize = 0;
		Cell currentCell = null;
		Cell pickedCell = null;
		List<Cell> visitingQue = new ArrayList<Cell>();
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
		Cell cell = null;
		for (int i = 0; i < input2.length; i++) {

			char[] c = input2[i].toCharArray();

			for (int j = 0; j < input1[1]; j++) {
				if (c[j] == '#') {

					cell = new Cell();
					cell.locRow = i;
					cell.locCol = j;
					cell.value = 999;
					land[i][j] = cell;
				} else {
					cell = new Cell();
					cell.locRow = i;
					cell.locCol = j;
					cell.value = Integer.parseInt(String.valueOf(c[j]));
					land[i][j] = cell;
				}

			}

		}
	}

	// private static void printArray(Cell[][] land2, int i, int j) {
	// for (int a = 0; a < i; a++) {
	// for (int b = 0; b < j; b++) {
	// System.out.println(land2[a][b]);
	// }
	// }
	// }

}

class Cell {
	int locRow;
	int locCol;
	int value;

	public Cell() {
		// TODO Auto-generated constructor stub
	}

	public int getLocRow() {
		return locRow;
	}

	public void setLocRow(int locRow) {
		this.locRow = locRow;
	}

	public int getLocCol() {
		return locCol;
	}

	public void setLocCol(int locCol) {
		this.locCol = locCol;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
