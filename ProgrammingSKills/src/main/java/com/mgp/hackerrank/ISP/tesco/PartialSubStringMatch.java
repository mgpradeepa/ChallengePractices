package com.mgp.hackerrank.ISP.tesco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartialSubStringMatch {

	public String getSubStringMatch(String input1, String input2) {

		return checkForPattern(input1, "([" + input2 + "]\\s*.*)(?<=[" + input2 + "])");
	}

	private String checkForPattern(String input1, String regex) {
		String ret = null;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input1);
		if (m.find()) {
			ret = m.group(1);
		}
		return ret;
	}

}
