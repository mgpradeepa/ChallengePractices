package com.mgp.hackerrank.ISP.amazon_july;

public class RhezoSeven {
	public static void main(String[] args) {
		java.util.Scanner sc = null;
		try {

			sc = new java.util.Scanner(System.in);
//			System.out.println("Enter N");
			String N = sc.next();
			char[] n = N.toCharArray();
//			System.out.println("Number of Questions");
			int Q = sc.nextInt();
			for (int i = 0; i < Q; i++) {
//				System.out.println("Enter values for L and R");
				int L = sc.nextInt();
				int R = sc.nextInt();
				printOp(checkSevenDivisble(getCompleteNumb(L, R, n)));

			}

		} catch (Exception e) {
		} finally {
			sc.close();
		}

	}

	static void printOp(Object e) {
		System.out.println(e);
	}

	static String checkSevenDivisble(int num) {
		String res = "NO";
		if (num % 7 == 0)
			res = "YES";

		return res;

	}

	static int getCompleteNumb(int L, int R, char[] numar) {
		String val = null;
		if(L == R) {
			val = String.valueOf(numar[L - 1]) ;
		}
		else{
			val = (String.valueOf(numar[L - 1]) + String.valueOf(numar[R - 1]));
		}
		int value = Integer.parseInt(val);
//		printOp(value);

		return value;
	}
}
