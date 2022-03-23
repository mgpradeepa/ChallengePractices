package com.mgp.gfg.prac.gts;

import java.util.Arrays;

public class WavePatternInSortedArray {

    public static void main(String... args) {
//        int n = 5;
//        int[] arr = {1, 2, 3, 4, 5};

        int n = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.stream(convertToWave(arr, n)) .forEach(System.out::print);
    }

    private static int[] convertToWave(int[] arr, int n) {
        for (int i = 0; i < n; ) {
            if (n % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                i += 2;
            } else {
                if (i == n - 1) {
                    arr[i++] = arr[n - 1];


                } else {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i += 2;

                }
            }


        }
        return arr;

    }
}
