package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Scanner;

public class NumOfSameCharsInTwoStrings {

    public static void main(String[] args) {
        System.out.println("Enter two strings to compare");
        String s1 = new Scanner(System.in).next();
        String s2 = new Scanner(System.in).next();
        NumOfSameCharsInTwoStrings noc = new NumOfSameCharsInTwoStrings();



        System.out.println("Number Of Same characters -> "+ noc.compareTwoStrings(s1, s2));

    }

    public  int compareTwoStrings(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
