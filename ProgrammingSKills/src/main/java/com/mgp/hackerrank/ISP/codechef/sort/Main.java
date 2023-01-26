package com.mgp.hackerrank.ISP.codechef.sort;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			java.io.IOException {
		java.io.BufferedReader br = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));

		int arSize = Integer.parseInt(br.readLine());
		java.util.List<Integer> intList = new java.util.ArrayList<Integer>();

		for (int i = 0; i < arSize; i++) {
			intList.add(Integer.parseInt(br.readLine()));
		}
		java.util.Collections.sort(intList);

		for (int i = 0; i < arSize; i++) {
			System.out.println(intList.get(i));
		}
	}
}
