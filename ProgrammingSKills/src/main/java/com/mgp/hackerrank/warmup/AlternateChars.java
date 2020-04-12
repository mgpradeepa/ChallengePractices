package com.mgp.hackerrank.warmup;

public class AlternateChars {
    public static void main(String[] args) {
        String s = "AAABBB";
        System.out.println(alternatingCharacters(s));
    }

    static int alternatingCharacters(String s) {

        int counter =0;
        char prevChar = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prevChar) {
                counter++;
                prevChar = s.charAt(i);
            } else {
                prevChar = s.charAt(i);
            }
        }


        return counter;
    }
}
