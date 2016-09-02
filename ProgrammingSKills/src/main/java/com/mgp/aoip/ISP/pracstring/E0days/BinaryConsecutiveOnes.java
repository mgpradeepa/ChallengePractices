package com.mgp.aoip.ISP.pracstring.E0days;

import java.util.Scanner;

public class BinaryConsecutiveOnes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();

		String binary = Integer.toBinaryString(n);

		System.out.println(binary);

		int op = checkConsecutiveNumbers(binary);
		System.out.println(op);
		in.close();

	}

	private static int checkConsecutiveNumbers(String bin) {

		
		int maxOnes =0;
		int ones = 0;
		for(int i = 0; i < bin.length();i++){
			if(bin.charAt(i) == '1'){
				ones++;
				maxOnes = Math.max(maxOnes, ones);
			}else ones =0;
		}
		return maxOnes;
	}
}
