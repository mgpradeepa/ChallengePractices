package com.mgp.aoip.ISP.pracstring.lc;

public class CheckTwoStringArraysEqual2ms {
    private static boolean checkIfArrayStringsAreEqual(String[] word1, String[] word2) {
        String sw1 = String.join("",word1);
        System.out.println("sw1 -> "+sw1);
        String sw2 = String.join("",word2);
        System.out.println("sw2 -> "+ sw2);
        return sw1.equals(sw2);
    }


    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a","bc"};
        System.out.println(checkIfArrayStringsAreEqual(w1,w2));

    }
}
