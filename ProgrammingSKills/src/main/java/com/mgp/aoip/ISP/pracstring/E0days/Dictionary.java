package com.mgp.aoip.ISP.pracstring.E0days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);
			// Write code here
		}
		while (in.hasNext()) {
			String s = in.next();

			// Write code here
			if (phoneBook.get(s) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + phoneBook.get(s));
			}
		}
		in.close();
	}

}
