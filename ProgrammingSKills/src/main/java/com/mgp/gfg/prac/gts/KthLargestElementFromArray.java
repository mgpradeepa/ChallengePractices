package com.mgp.gfg.prac.gts;

import java.util.Arrays;

/**
 * given an array provide the reverse sorted array of K elelments
 *
 * a[] = { 1,3,6,4,8,9}
 * K = 3
 * op = {9, 8, 6}
 */
public class KthLargestElementFromArray {
    public static void main(String[] args) {
        int[] A =  { 1,3,6,4,8,9};
        int K  = 2;
        for(Integer i : findKthLargestElements(A, K)) {
            System.out.print(i + " ,");
        }

    }

    private static int[] findKthLargestElements(int[] a, int k) {

        int[] result = new int[k];
        Arrays.sort(a);

        for(int i = a.length-1, j = 0; i> 0 && k > 0 ; i--, j++) {
            result[j] = a[i];
            k--;
        }
        return result;
    }


}
