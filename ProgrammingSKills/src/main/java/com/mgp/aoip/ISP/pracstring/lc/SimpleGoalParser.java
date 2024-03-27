package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Scanner;

public class SimpleGoalParser {

    public static void main(String[] args) {
        SimpleGoalParser sgp = new SimpleGoalParser();
        String s = new Scanner(System.in).next();
        System.out.println(sgp.goalParser(s));
    }

    public String goalParser(String s) {
        // Intent : String has series of chars .
        // If G -> G ; () -> o; (al)-> al . Order can be any

        StringBuffer sbf = new StringBuffer();
        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) == 'G') sbf.append("G");
            else if(s.charAt(i) =='(' && s.charAt(i+1) ==')'){
                sbf.append("o");
                i = i+1;
            }
            else if(s.charAt(i) == '(' && s.charAt(i+1) == 'a') {
                sbf.append("al");
                i = i+3;
            }

        }
return sbf.toString();
    }
}
