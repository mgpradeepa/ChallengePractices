package com.mgp.gfg.prac.gts;

import java.util.Arrays;

public class FindSumOfMaxAndMinFromarray {
    public static void main(String[] args) {
        int[] a = {-2, 1, -4, 5, 3};
        int N = 5;
        System.out.println("Sum = " + findSum(a, N));

    }

    private static int findSum(int[] A, int N) {
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::print);
        return A[0] + A[N-1];

    }
}
