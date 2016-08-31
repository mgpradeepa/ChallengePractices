package com.mgp.hackerrank.ISP.vmware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution4 {
	// get the valid domains
	public static void main(String[] args) {

		String regesx = "(^[a-zA-Z0-9]+.[a-zA-Z0-9]+.[a-zA-z0-9]+.)[a-zA-z0-9]$";
		// String regesx =
		// "(?=\^\.{4,253}$)(^((?!-)[a-zA-Z0-9-]{1,63}(?<!-)\.)+[a-zA-Z]{2,63}$)";
		String inp = "www.google.for.com";

		Pattern p = Pattern.compile(regesx);
		Matcher m = p.matcher(inp);
		if (m.find()) {
			m.group(1);
			System.out.println(" output " + inp.substring(m.start(), m.end()) + " " + m.group(1));
		}

	}
	/**
	 * URI uri = new URI(url); String domain = uri.getHost(); return
	 * domain.startsWith("www.") ? domain.substring(4) : domain;
	 */
}
