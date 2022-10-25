package com.mgp.aoip.ISP.pracstring.lc;

public class CheckTwoStringArraysEqual1ms {

    private static boolean arrayStringEqual(String[] word1, String[] word2) {
        String s1 = arraytoString(word1);
        String s2 = arraytoString(word2);
        return s1.equals(s2);

    }
    private static String arraytoString(String[] w) {
        StringBuilder s1 = new StringBuilder();
        for(String s : w) {
            s1.append(s);
        }
        return s1.toString();

    }
    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a","bc"};
        System.out.println(arrayStringEqual(w1,w2));

    }
}
