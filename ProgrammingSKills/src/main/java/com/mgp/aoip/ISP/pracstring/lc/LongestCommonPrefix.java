package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    // intent: Each word
    /**
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     */

    public static void main(String[] args) {
//        String [] input = {"flower","flow","flight"};
//        String[] input = {"dog","racecar","car"};
        String[] input = {"cir","car"};
        System.out.println("\n\n" + longestCommonPrefix(input));
    }

    private static  String longestCommonPrefix(String[] strs) {
        // sort the given string array
        // compare the first string and the last string
        // if exists

        Arrays.sort(strs);
        Stream.of(strs).forEach(System.out::println);

        // get first and last string
        String first = strs[0];
        String last = strs[strs.length -1];
        if(Objects.equals(first, "")) return "";

        // iterate over the first and last strings
         // if there are common prefixes that constitutes the result

        int firstLength = first.length();
        int lastLength = last.length();

        int iter = Math.min(firstLength, lastLength);

        // iterate
        StringBuilder sb = new StringBuilder();
        if(first.charAt(0) != last.charAt(0)) {
            return "";
        }
        int count = 0 ;
        for(int i = 0; i < iter; i++) {

            if(first.charAt(i) == last.charAt(i) && count== i){
                count++;
                sb.append(first.charAt(i));
            }


        }
        return sb.toString();

    }

}
