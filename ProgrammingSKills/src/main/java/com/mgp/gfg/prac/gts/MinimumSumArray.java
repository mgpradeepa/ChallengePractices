package com.mgp.gfg.prac.gts;

import java.util.Arrays;

/**
 * Input:
 * N = 5
 * Arr[] = {5, 3, 0, 7, 4}
 * Output: 82
 * Explanation: The minimum sum is
 * formed by numbers 35 and 047.
 *
 */
public class MinimumSumArray {
    public static void main(String[] args) {
        int[] a = {5, 3, 0, 7, 4};
        System.out.println(solve(a, a.length));
    }

    // Function for finding sum of larger numbers
    public static String findSum(String s1, String s2) {
        // Before proceeding further, make sure length
        // of str2 is larger.
        char[] str1, str2;
        if (s1.length() > s2.length()) {
            str1 = s2.toCharArray();
            str2 = s1.toCharArray();
        }
        else {
            str1 = s1.toCharArray();
            str2 = s2.toCharArray();
        }

        // Take an empty string for storing result
        StringBuilder str = new StringBuilder("");

        // Calculate length of both string
        int n1 = str1.length, n2 = str2.length;
        int diff = n2 - n1;

        // Initially take carry zero
        int carry = 0;

        // Traverse from end of both strings
        for (int i = n1 - 1; i >= 0; i--) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((str1[i] - '0') + (str2[i + diff] - '0') + carry);
            str.append(sum % 10 + "");
            carry = sum / 10;
        }

        // Add remaining digits of str2[]
        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ((str2[i] - '0') + carry);
            str.append(sum % 10 + "");
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0) str.append(carry + "");

        // reverse resultant string

        return str.reverse().toString();
    }


    public static String solve(int arr[], int n) {
        // sort the array
        Arrays.sort(arr);

        // let two numbers be a and b
        StringBuilder a = new StringBuilder(""), b = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) continue;
            // fill a and b with every alternate digit
            // of input array
            if ((i & 1) == 1)
                a.append("" + arr[i]);
            else
                b.append("" + arr[i]);
        }

        // return the sum
        return findSum(a.toString(), b.toString());
    }

    public static String ppSolve(int arr[], int n) {
        // code here
        // sort the array in ascending order
        // every even numbers and odd numbers to be picked to do the sum

        // arrr = Arrays.stream(arr).sorted().toArray();
        Arrays.sort(arr);

        StringBuilder sbeven = new StringBuilder();
        StringBuilder sbodd = new StringBuilder();
        // long result = 0L;
        java.math.BigInteger result ;
        if(n == 1) {
            result = java.math.BigInteger.valueOf(arr[0]);
            // result = arr[0];
            return resultant(result);
        }

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sbeven.append(arr[i]);

            }
            else {
                sbodd.append(arr[i]);
            }
        }
        String seven = sbeven.toString();
        String sodd = sbodd.toString();
        // System.out.println("even " + seven + "  odd " + sodd);
        // if(seven == "" || seven == null || sodd == "" || sodd == null) {
        //     result =
        // }

        java.math.BigInteger beven = seven =="" ? java.math.BigInteger.ZERO: new java.math.BigInteger(seven);
        java.math.BigInteger bodd = sodd  =="" ? java.math.BigInteger.ZERO:  new java.math.BigInteger(sodd);

        // long leven = seven == "" ? 0L : Long.parseLong(seven);
        // long lodd = sodd == "" ? 0L :  Long.parseLong(sodd);

        // result = leven + lodd;
        result = beven.add(bodd);
        // System.out.println(result);
        return resultant(result);

    }

    private static String resultant(java.math.BigInteger result ) {
        String numString = result.toString();
        return removeLeadingZeroes(numString);
        // return numString;

    }
    private static String removeLeadingZeroes(String numberString) {
        // zeros from a string
        String regex = "^0+(?!$)";

        // Replaces the matched
        // value with given string
        numberString = numberString.replaceAll(regex, "");

        return numberString ;
    }
}
