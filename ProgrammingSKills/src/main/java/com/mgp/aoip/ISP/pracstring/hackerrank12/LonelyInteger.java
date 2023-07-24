package com.mgp.aoip.ISP.pracstring.hackerrank12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String... args) {
        int[] ar = {1, 2, 3, 4, 3, 2, 1};
        List<Integer> inp = Arrays.stream(ar).boxed().collect(Collectors.toList());
        int result = findAlone(inp);
        System.out.println(result);

    }
    private static int findAlone(List<Integer> n){
        int result   = 0 ;
        for(Integer i : n ) {
            result ^= i;
        }
        return result;
    }
}
