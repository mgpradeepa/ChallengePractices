package com.mgp.hackerrank.ISP.tesco;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 
 * 
 * @author mgpradeepa
 * 
 *         Inp : main string "My Name is Fran search string : rim op => me is Fr
 *
 */
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		Question2 q = new Question2();
		String op = q.GetSubString(s1, s2);
		System.out.println(op);

	}

	public String GetSubString(String input1, String input2) {
		StringBuffer sbf = new StringBuffer();
		String regex = "([" + input2 + "]\\s*.*)(?<=["+input2+"])";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input1);
		if (m.find()) {
			sbf.append(m.group(1));
		}

		return sbf.toString();
	}

}
