package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySumMultiplesOfK {
//nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
    private static  boolean checkSubarraySum(int[] nums, int k) {

        // initialize the hash map with index 0 for sum 0
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>() {{put(0,0);}};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
                // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(checkSubarraySum(nums,k));
    }
}


