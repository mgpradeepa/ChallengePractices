package com.mgp.gfg.prac.gts;

import java.util.Arrays;

public class CanMakeTriangle {
    // consider consecutive indxes of an array and find out whether we can make a triangle if
    // indicies a, b and c if a+b>c and a+c>b and b+c>a.

    public static void main (String ...args) {
        int n = 4;
        int[] A = {1,2,2,4};

        Arrays.stream(canMakeATriangle(A, n)).forEach(System.out::print);
    }

    private static int[] canMakeATriangle(int[] A, int n) {
        int[] result = new int[n-2];
        for(int i = 0; i < n-2; i++) {
            int a = A[i];
            int b = A[i+1];
            int c = A[i+2];
            if((a + b > c && b+c >a )  && c + a >b ) {
                result[i]=1;
            }
            else result[i] =0;
        }

        return result;
    }
}
