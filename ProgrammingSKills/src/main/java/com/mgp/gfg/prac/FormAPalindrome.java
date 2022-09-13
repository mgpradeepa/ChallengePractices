package com.mgp.gfg.prac;

public class FormAPalindrome {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findMinInsertions(s));

    }

    private static int findMinInsertions(String S){
        // code here
        // anasdad
        // dadanasdad
        //anasdadsana

        // abdcdba
        StringBuilder sb = new StringBuilder(S);
        String reverse = sb.reverse().toString();
        if (S.equals(reverse)) {
            return 0;
        }
        else {
            // when each of the
            int length = S.length();
            int midLen = length / 2;

            StringBuilder mid = new StringBuilder();
            return S.length() -1;
        }
    }

}
