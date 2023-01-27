package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashSet;
import java.util.Set;

public class DistinctIndiciesContainsDuplicates {
    // if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

    private static boolean containsNearbyDuplicate(int[] nums, int k ) {
        // usingSet for deuplicates
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i-> " + nums[i]);
            if (i > k) {
                System.out.println("i-k-1" + nums[i - k - 1]);
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;

    }





    public static void main(String[] args) {
//        int[] num = {1,2,3,1};
//        int l = 3;
        int[] num = {1,0,1,1};
        int l = 1;
//        int[] num = {1,2,3,1,2,3};
//        int l = 2;
        System.out.println(containsNearbyDuplicate(num,l));
    }
}
