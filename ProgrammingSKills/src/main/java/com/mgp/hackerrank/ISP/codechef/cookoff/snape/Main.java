package com.mgp.hackerrank.ISP.codechef.cookoff.snape;

public class Main {

	public static void main(String[] args) {
		Double b = 10.00;
		Double bs = 12.00;
		System.out.println("" + Math.sqrt((Math.pow(b, 2) + Math.pow(bs, 2))));
		Double min = Math.min(b, bs);
		double max = Math.max(b, bs);
		Double r = min / max;
		System.out.println("r " + r);
		System.out.println("Min" + max * Math.sqrt(1 + r * r));
	}
}
