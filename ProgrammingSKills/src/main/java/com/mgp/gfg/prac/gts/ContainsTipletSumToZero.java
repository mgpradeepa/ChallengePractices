package com.mgp.gfg.prac.gts;

import java.util.Arrays;

public class ContainsTipletSumToZero {
    public static void main(String[] args) {
        int n = 5;
        //example 1
//        int[] arr= {0, -1, 2, -3, 1};
        //example 2
        int[] arr = {0, -1, 2, -3, 5};
        System.out.println(findTripletSumToZero(arr, n) ? 1 : 0);
    }

    private static boolean findTripletSumToZero(int[] a, int n) {
        //add code here.
        // lets first sort it so that we can get traversing easier
        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            int num = a[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = a[left] + a[right] + num;
                if (sum == 0) {
                    return true;


                } else if (sum > 0) {
                    right--;
                } else {
                    left++;

                }
            }
        }

        return false;


    }
}
