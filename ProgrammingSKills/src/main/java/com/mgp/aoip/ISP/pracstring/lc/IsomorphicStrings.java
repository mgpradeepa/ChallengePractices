package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        // find isomorphic
        String s = "title";
        String t = "paper";
        System.out.println(isIsomorphic(s,t));
    }
    private static boolean isIsomorphic(String s, String t) {
        // title is isomorphic to paper
        // create hashmap of <char, char>
        // put if the s[i] has and t[i] is not in values.

        Map<Character, Character> charMap = new HashMap<>();
        char c;

        for(int i = 0 ; i  < s.length(); i++) {
            if(charMap.containsKey(s.charAt(i))) {
                c = charMap.get(s.charAt(i));
                if(c != t.charAt(i)) {
                    return false;
                }
            }else if(!charMap.containsValue(t.charAt(i))) {
                charMap.put(s.charAt(i), t.charAt(i));
            }
            else return false;
        }
        return true;

    }
}
