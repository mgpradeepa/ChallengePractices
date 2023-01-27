package com.mgp.gfg.prac;

import java.util.HashMap;
import java.util.Map;

public class CountDashesToMakeANumber {
    public static void main(String[] args) {
        String input  = "12134";
        System.out.println(countDashes(input));
    }

    private static int countDashes(String input) {
        Map<Character, Integer>  dashMap = new HashMap<>();
        dashMap.put('0',6 );
        dashMap.put('1',2 );
        dashMap.put('2',5 );
        dashMap.put('3',5 );
        dashMap.put('4',4 );
        dashMap.put('5',5 );
        dashMap.put('6',6 );
        dashMap.put('7',3 );
        dashMap.put('8',7 );
        dashMap.put('9',6 );

        int sum = 0 ;
        for(Character c : input.toCharArray()) {
            sum+= dashMap.get(c);
        }


        return sum;


    }
}
