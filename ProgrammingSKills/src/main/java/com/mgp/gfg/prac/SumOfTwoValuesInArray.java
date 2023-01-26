package com.mgp.gfg.prac;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoValuesInArray {
    public static void main(String[] args) {
        int[] v = {5, 7, 1, 2, 8, 4, 3};
        System.out.println(hasSumOfTwoValues(v, 19));

    }
    private static boolean hasSumOfTwoValues(int []a, int val) {
        Set<Integer> sumValues = new HashSet<>(a.length);
        for(Integer in : a) {
            if(sumValues.contains(val - in)) {
                return true;
            }
            sumValues.add(in);

        }
        return false;

    }
}
