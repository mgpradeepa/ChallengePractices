package com.mgp.hackerrank.ISP.altimetrik_july;

public class JustNumbers {
	public static void main(String[] args) {
		for (int i = 100; i <= 300; i++) {
			if (specialNumber(i))
				System.out.println(i);
		}
	}

	private static boolean specialNumber(int n) {
		if (n == 1)
			return true;
		for (int x = 2; x <= Math.sqrt(n); x++) {
			int p = x;
			while (p <= n) {
				p *= x;
				if (p == n)
					return true;
			}

		}

		return false;
	}
}
