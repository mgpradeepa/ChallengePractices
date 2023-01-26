package com.mgp.hackerrank.ISP.RiseSmart;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	static Map<Integer, Double> map = new HashMap<Integer, Double>();

	public static void main(String[] args) {

		System.out.println(calculateWeight("128", "3"));
	}

	static String calculateWeight(String weightOnEarth, String planetCode) {
		// weightOnEarth is in lbs. planetCode is the number in planet table
		// eg 1 refer to Venus whose conversion factor is 0.78
		// after conversion, the return value should be string format with
		// rounding till 2 decimals
		map.put(1, 0.78);
		map.put(2, 0.39);
		map.put(3, 2.65);
		map.put(4, 1.17);
		map.put(5, 1.05);
		map.put(6, 1.23);
		Integer n = Integer.parseInt(weightOnEarth);
		Integer pc = Integer.parseInt(planetCode);
		Double gravity = (n * map.get(pc));

		DecimalFormat df = new DecimalFormat("#.##");
		df.setMinimumFractionDigits(2);

		return String.valueOf(df.format(gravity));
	}
}
