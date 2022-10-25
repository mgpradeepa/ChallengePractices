package com.mgp.aoip.ISP.pracstring.lc;

import java.util.*;

public class MaxLengthOfConcatinatedStringUniq {
    private static  int maxLength(List<String> arr) {
        // fetch each String in list check nonduplicateness
        // iterate over the i+1 to n strings of the list
        // concat each and validate for nonduplicatedness.
        // each time calculate the maxlength of unique
        // return the unique.

        int maxLen = 0;
        int sz = arr.size();

        for(int i = 0 ; i < sz;i++) {

            maxLen = Math.max(checkUnique(arr.get(i)), maxLen) ;


            for(int j = i+1; j< sz; j++) {
                maxLen = Math.max(checkUnique(arr.get(i) + arr.get(j)), maxLen) ;
            }
        }
        return maxLen;

    }

    private static int checkUnique(String content) {
        int mL = 0;
        Set<Character> cset = new HashSet<>();
        boolean unique = false;
        for(Character c : content.toCharArray()) {
            if(!cset.add(c)) {
                unique = false;
                break;
            }else {
                cset.add(c);
            }
        }
        if(cset.size() == content.length()) {
            unique = true;
            mL = content.length();
        }
//        if(unique) {
//            mL = content.length();
//        }

        return mL;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("un");
        l.add("iq");
        l.add("ue");
        String [] ss = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"};
        System.out.println(maxLength(Arrays.asList(ss)));
    }
}
