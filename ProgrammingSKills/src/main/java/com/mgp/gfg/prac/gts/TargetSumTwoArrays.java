package com.mgp.gfg.prac.gts;

import java.util.*;
import java.util.stream.Collectors;

public class TargetSumTwoArrays {
    public static void main(String... args) {

        // two arrays equal length
        // target number -- > sum from one value from a1 and another from a2 should be the taget

        int a[] = {-1, 3, 8, 2, 9, 0};
        int b[] = {4, 1, 2, 10, 5, 20};
        int target = 24;

        Arrays.stream(bruteForceTargetTosum(a, b, target)).forEach(System.out::println);
    }

    //bruteforce technique
    private static int[] bruteForceTargetTosum(int[] a, int[] b, int target) {
        int result[] = new int[2];
        //iterate over each element from first and all from second and check the nearest to target
        int howNearer = Integer.MAX_VALUE;
        int arraLength = a.length;
        // put first array in to a set.
        // iterate over second array and fgure out is there a sum to target.
        // if you find the target then thats your number else store these sum and find out the nearest

        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : a) {
            set.add(i);
        }


        for (int i = 0; i < arraLength; i++) {
            int now = target - b[i];
            if (!set.add(now)) {
                result[0] = now;
                result[1] = b[i];
            }

        }

        return result;
    }

}
