package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Arrays;

public class PlusOneArrayDigits {
    //consider the given array of number as a one whole number and add 1 to the number and return in the form of array itself.

    private static int[] pluOne(int[] digits) {
        int n = digits.length -1;
        for(int i = n ; i >=0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;

            }
            digits[i] = 0;
        }

        int[] newd = new int[n+2];
        newd[0] =1;
        return newd;
    }

    public static void main(String[] args) {

        int[] digits = {9,9};
        int[] a = pluOne(digits);
        Arrays.stream(a).mapToObj(j -> j + " ").forEach(System.out::print);

    }
}
