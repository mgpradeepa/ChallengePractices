package com.mgp.hackerrank.warmup;

public class NumberOfSubSequences {
    /**
     * Given a string, count number of subsequences of the form aibjck, i.e.,
     * it consists of i ’a’ characters, followed by j ’b’ characters, followed by k ’c’ characters
     * where i >= 1, j >=1 and k >= 1.
     * <p>
     * Note: Two subsequences are considered different if the set of array indexes picked
     * for the 2 subsequences are different.
     * <p>
     * Example
     * Input  : abbc
     * Output : 3
     * Subsequences are abc, abc and abbc
     * <p>
     * Input  : abcabc
     * Output : 7
     * Subsequences are abc, abc, abbc, aabc
     * abcc, abc and abc
     */

    public static int countSubSequences(String s) {
        //initialize al cahr counts to 0
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount = (1 + 2 * aCount);
            }
            if (s.charAt(i) == 'b') {
                bCount = aCount + 2 * bCount;

            }
            if (s.charAt(i) == 'c') {
                cCount = bCount + 2 * cCount;
            }
        }
        return cCount;

    }

    // Driver code
    public static void main(String[] args) {
        String s = "abbc";
        System.out.println(countSubSequences(s));
    }

}
