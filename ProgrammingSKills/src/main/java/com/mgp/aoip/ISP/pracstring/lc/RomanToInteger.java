package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
//        String s = "MCMXCIV" ;
        String s = "III" ;
//        String s = "LVIII";
        System.out.println(romanToInt(s));

    }
    private static int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        char[] roman = s.toCharArray();
        int n = roman.length-1;
        int integer = 0;
        int p = 0;
        for(int l = n ; l >= 0; l--) {
            int f = symbols.get(roman[l]);

            System.out.println("f-> "+ f + " p -> " + p);
            if(f < p) {// V I


                integer -= f;
                System.out.println("if in  integer -> "+ integer);
//                l-=2;

            }
            else {
                integer += f;
                System.out.println("else in  integer -> "+ integer);
//                l--;
            }
            p = f;


        }
        return integer ;

    }
}
