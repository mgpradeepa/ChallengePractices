package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateAndMissingNumber {
    private static int[] findSetMisMatch(int[] nums) {
        // find the missing number by summation rule
        // while finding the total sum keep adding to the set . if found duplicate, store and ignore for suming

        int[] res = new int[2];
        int n = nums.length;
        int missable = (n * ( n + 1))/2;

        Set<Integer> set = new HashSet<>(); // to evaluate the duplicates
        for (int num : nums) {
            if (!set.add(num)) {
                res[0] = num;
            } else {
                missable -= num;
            }

        }
        res[1] = missable;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        for(int num : findSetMisMatch(nums)) {
            System.out.println(num);
        }


    }
}
