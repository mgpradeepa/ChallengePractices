package com.mgp.hackerrank.ISP.booking.com.nl;

import java.util.Scanner;
/**
 * 
 * @author mgpradeepa
 *
 */
//Check whether the given dimension belongs to a polygon or square or rectangle. 
//Square cannot be considered as rectangle. 
//Only once it should be considered.
// Input:
// 4
// 12 23 12 23
// 23 34 34 45
// 1 1 1 1
// 4 4 4 4
// Output: 2 1 1
public class SqPolRecSolution {

	public static void main(String[] args) {
		// System.out.println("Enter the required inputs");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int rec = 0;
		int sq = 0;
		int pol = 0;

		String p[] = new String[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextLine();
		}
		int temp[] = new int[4];

		for (int i = 0; i < p.length; i++) {
			String s[] = p[i].split(" ");
			for (int j = 0; j < s.length; j++) {
				temp[j] = Integer.parseInt(s[j]);
				System.out.println(temp[j]);

			}
			if (temp[0] == temp[1] && temp[2] == temp[3] && temp[1] == temp[3] && temp[2] == temp[0])
				sq++;
			else if (temp[0] == temp[2] & temp[1] == temp[3])
				rec++;
			else
				pol++;
		}

		System.out.println(sq + " " + rec + " " + pol);

		sc.close();
	}

}
