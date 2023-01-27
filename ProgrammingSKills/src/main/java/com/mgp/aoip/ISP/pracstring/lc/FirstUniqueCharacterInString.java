package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    private static int firstUniqueCharInString(String s) {

        if(s == null || s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(int i = 0 ; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "lovely";
//        String s = "aaaaaaaaaaaaaaaaaaaaaaab";
        int res = firstUniqueCharInString(s);
        System.out.println(res);
    }
}
