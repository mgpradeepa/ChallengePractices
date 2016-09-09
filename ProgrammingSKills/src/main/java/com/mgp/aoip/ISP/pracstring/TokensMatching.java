package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;

/**
 * Given a string,s , matching the regular expression [A-Za-z !,?._'@]+, split
 * the string into tokens. We define a token to be one or more consecutive
 * English alphabetic letters. Then, print the number of tokens, followed by
 * each token on a new line.
 * 
 * @author mgpradeepa
 *
 *         Sampl Input: He is a very very good boy, isn't he?
 *
 *         10 He is a very very good boy isn t he
 */
public class TokensMatching {
	// [A-Za-z !,?._'@]+
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String regex = " !,?._'@";
		scan.close();

		StringTokenizer st = new StringTokenizer(s, regex);
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
