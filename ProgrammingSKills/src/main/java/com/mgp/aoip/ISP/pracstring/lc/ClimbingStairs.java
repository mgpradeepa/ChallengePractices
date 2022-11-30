package com.mgp.aoip.ISP.pracstring.lc;

public class ClimbingStairs {
    /**
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     */

    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }
    private static  int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n ==1) return 1;
        if(n ==2) return 2;

        dp[0]= 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i -2];
        }
        return dp[n];
    }
}
