package com.mgp.gfg.prac.gts;

/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
 */
public class KadaneAlgoMaxContigiousSubArray {
    public static void main(String[] args) {

        int[] a =  {1,2,3,-2,5};
        int n = 5;

        System.out.println(maxSubarraySum(a,n));

    }

    private static long maxSubarraySum( int a[], int n ) {
        int maxSoFar = a[0];
        int curMax = a[0];
        for(int i =1; i < n; i++ ) {
            curMax = Math.max(a[i],curMax + a[i]);
            maxSoFar = Math.max(maxSoFar, curMax);

        }
        return maxSoFar;
    }

}
