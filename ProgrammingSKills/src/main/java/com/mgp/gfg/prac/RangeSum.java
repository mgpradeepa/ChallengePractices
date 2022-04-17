package com.mgp.gfg.prac;

public class RangeSum {
    public static void main(String[] args) {
        int i = 4, j = 9, k = 7;
        System.out.println(findRangeSum(i, j , k ));
    }

    private static long findRangeSum(int i, int j, int k) {
        long sum = 0L;
        for(int a = i ; i < j ; i++) {
            sum = sum + i ;
        }
        for(int a = j ; j >=k ; j--) {
            sum = sum + j ;
        }
        return sum;
    }
}
