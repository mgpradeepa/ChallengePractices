package com.mgp.aoip.ISP.pracstring.lc;

public class RobMaxMoney {

    /**
     * Adjasent houses cannot be robbed , maximum that can be robbed to be reported
     */
    private static int rob(int[] nums) {
        int maxSum = 0;
        int curSum = 0;
        if(nums.length == 0) return 0;

        for(int n : nums) {
            int t = maxSum ;
            maxSum = Math.max(curSum + n , maxSum);
            curSum = t;
        }
        return maxSum;
    }
    public static void main(String... args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
