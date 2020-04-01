package com.mgp.gfg.prac;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharsInString {

    public static void main(String[] args) {
        String str = "AprilFool";
        System.out.println(checkDuplicate (str));
    }

    private static int checkDuplicate(String str) {
        char[] charsInString = str.toCharArray();
        Set<Character> charSet = new TreeSet<>();
        int i = 0;
        for(Character c: charsInString) {

            if(!charSet.add(c)) {
                System.out.println("Duplicate char is " + c+ " "+ i);
                return 0;
            }
            ++i;
        }
        System.out.println("No duplicates");
        return 1;
    }
}
