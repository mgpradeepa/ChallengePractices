package com.mgp.aoip.ISP.pracstring;

import java.util.Scanner;

public class IPMatchRegex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
		}
		in.close();

	}
}

class myRegex {
	protected String pattern;

	myRegex() {
		String p = "(\\d{1,2}|(0|1)\\d{2}|2[0-5]{2})";

		this.pattern = "^" + p + "\\." + p + "\\." + p + "\\." + p + "$";
	}
}