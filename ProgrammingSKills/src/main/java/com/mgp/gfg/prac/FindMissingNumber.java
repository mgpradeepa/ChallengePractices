package com.mgp.gfg.prac;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {3, 4, 6, 1, 2, 5, 8};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] a) {
        int len = a.length;
        int flatSun = 0;
        for (Integer in : a) {
            flatSun += in;

        }
        int n = a.length + 1;
        int actualSum = (n * (n + 1)) / 2;
        int missing = actualSum - flatSun;
        return missing;


    }
}
