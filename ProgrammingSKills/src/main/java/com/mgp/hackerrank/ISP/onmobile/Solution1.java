package com.mgp.hackerrank.ISP.onmobile;


import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Comparator comp = new Comparator();

		int testCases = Integer.parseInt(scan.nextLine());
		while (testCases-- > 0) {
			int condition = Integer.parseInt(scan.nextLine());
			switch (condition) {
			case 1:
				String s1 = scan.nextLine().trim();
				String s2 = scan.nextLine().trim();

				System.out.println((comp.compare(s1, s2)) ? "Same" : "Different");
				break;
			case 2:
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();

				System.out.println((comp.compare(num1, num2)) ? "Same" : "Different");
				if (scan.hasNext()) { // avoid exception if this last test case
					scan.nextLine(); // eat space until next line
				}
				break;
			case 3:
				// create and fill arrays
				int[] array1 = new int[scan.nextInt()];
				int[] array2 = new int[scan.nextInt()];
				for (int i = 0; i < array1.length; i++) {
					array1[i] = scan.nextInt();
				}
				for (int i = 0; i < array2.length; i++) {
					array2[i] = scan.nextInt();
				}

				System.out.println(comp.compare(array1, array2) ? "Same" : "Different");
				if (scan.hasNext()) { // avoid exception if this last test case
					scan.nextLine(); // eat space until next line
				}
				break;
			default:
				System.err.println("Invalid input.");
			}// end switch
		} // end while
		scan.close();
	}
}

class Comparator {

	boolean compare(int n1, int n2) {
		if (n1 == n2)
			return true;
		else
			return false;
	}

	boolean compare(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		else {
			return false;
		}
	}
	
	boolean compare (int [] a1, int []a2) {
		boolean res = Boolean.TRUE;
		if(a1.length != a2.length) {
			res = Boolean.FALSE;
			return res;
		}
		
		for(int i =0; i < a1.length-1;i++ ){
			if(a1[i] != a2[i]) res = Boolean.FALSE;
		}
		return res;
	}

}
