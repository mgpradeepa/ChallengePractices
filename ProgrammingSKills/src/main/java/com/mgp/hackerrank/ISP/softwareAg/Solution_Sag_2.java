package com.mgp.hackerrank.ISP.softwareAg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution_Sag_2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int _numbers[] = { 2, 3, 54, 1011 };
		String[] res = romanizer(_numbers);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(res[res_i]);
		}

		sc.close();
	}

	static String[] romanizer(int[] numbers) {
		String[] result = new String[numbers.length];
		List<String> list = new ArrayList<>();
		LinkedHashMap<String, Integer> romnum = new LinkedHashMap<String, Integer>();
		romnum.put("M", 1000);
		romnum.put("CM", 900);
		romnum.put("D", 500);
		romnum.put("CD", 400);
		romnum.put("C", 100);
		romnum.put("XC", 90);
		romnum.put("L", 50);
		romnum.put("XL", 40);
		romnum.put("X", 10);
		romnum.put("IX", 9);
		romnum.put("V", 5);
		romnum.put("IV", 4);
		romnum.put("I", 1);
		for (int i = 0; i < numbers.length; i++) {
			int Int = numbers[i];

			 String res = "";
			for (Map.Entry<String, Integer> entry : romnum.entrySet()) {
				int matches = Int / entry.getValue();
				res+=(repeat(entry.getKey(), matches));
				Int = Int % entry.getValue();
			}
			list.add(res);
			Object[] olist = list.toArray();
			result = Arrays.copyOf(olist, olist.length, String[].class);
		}
		// return
		return result;

	}

	public static String repeat(String s, int n) {
		if (s == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}
