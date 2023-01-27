package com.mgp.gfg.prac;

import java.util.Arrays;
import java.util.List;

public class StayPositiveVA {
    public static void main(String[] args) {

        List<Integer > arr = Arrays.asList(-3,2,-3,4,2);
        System.out.println(minstart(arr));

    }

    public static long minstart(List<Integer> arr) {
        // logic
        // On finding the sum of each number and acc there would be a least number of which we will have to keep incrementing
        // hence find the least number of sum that we would encounter.
        // which would ideally be like (-4) in this array {-3,2,-3,4,2}
        // minimum positive x would be 1-(-4) = 5
        //
        long min = 0, sum = 0;
        for( Integer  i : arr) {
            sum+=i;

            min = Math.min(min, sum);
            System.out.println(min);
        }
        return 1-min;

    }

}
