package com.mgp.gfg.prac;

import java.util.Arrays;

public class PluckOrSkipFlowerGarden {

    public static long maximumBeauty(int N, int K, int[]B) {
        // create memoization table for previously calculated results

        long[][] memo =new long[N+1][K+1];
        for(int i = 0 ; i <=N;i++) {
            Arrays.fill(memo[i], -1);

        }
        return maximumBeautyHelper(N-1, K , B, memo);
    }

    private static long maximumBeautyHelper(int index, int k, int[] b, long[][] memo) {

        // Base case for k = 0
        if ( k == 0 ) return 0;

        // Base case if index < 0 or k is negative return -ve infinity
        if(index < 0 && k < 0){
            return Long.MIN_VALUE;
        }
        // if the result is already memoized due course return it

        if(memo[index][k] != -1){
            return memo[index][k];
        }

        // Calculate the maximum beauty by plucking current flower or
        // by skipping the next flower or by skipping the current flower

        long pickCurrent = b[index] + maximumBeautyHelper(index-2, k-1, b, memo);
        long skipCurrent = maximumBeautyHelper(index-1, k, b, memo);

        // Store the maximum Beuaty in memo table
        memo[index][k] = Math.max(pickCurrent, skipCurrent);

        return memo[index][k];

    }
}

