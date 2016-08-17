package com.mgp.hackerrank.ISP.softwareAg;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution_Sag_4 {
	public static void main(String[] argh) {
		Parsed z = new Parsed();
//		Parser y = new Parser();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input");
		String next = null;
		while (in.hasNext()) {
			next = in.next();
//			System.out.println("Partial correct " + y.checkParenthesisBalance(next));
			System.out.println("Seems to accomplish all cases " + z.checkParenthesisBalance(next));
		}
		in.close();
	}

}

// partially correct. Does not hold good for all the validity cases.
class Parser {

	boolean checkParenthesisBalance(String s) {
		Stack<Integer> stk = new Stack<Integer>();
		String exp = s;
		boolean res = true;
		int len = exp.length();
		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stk.push(i);
			else if (ch == ')' || ch == '}' || ch == ']') {
				try {
					int p = stk.pop() + 1;
				} catch (Exception e) {

				}
			}
		}
		while (!stk.isEmpty()) {
			int p = stk.pop() + 1;
			if (p == '(' || p == '[' || p == '{')
				res = false;
		}

		return res;
	}
}

// holds good for all the cases.
class Parsed {

	boolean checkParenthesisBalance(String s) {
		Stack<Character> stk = new Stack<Character>();
		boolean res = true;

		HashMap<Character, Character> braMap = new HashMap<>();
		braMap.put('(', ')');
		braMap.put('{', '}');
		braMap.put('[', ']');
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (braMap.keySet().contains(c)) {
				stk.push(c);
			} else if (braMap.values().contains(c)) {
				if (!stk.isEmpty() && braMap.get(stk.peek()) == c) {
					stk.pop();
				} else
					res = false;
			}
		}

		return res;
	}

}
