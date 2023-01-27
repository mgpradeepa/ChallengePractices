package com.mgp.aoip.ISP.pracstring.lc;

 public class NumberPalindrome {
    public static void main(String[] args) {
        // Check whether a given number is a palindrome
        int number = -121;
        System.out.println("the number is a palindrome --> { " + isPalindrome(number) + " }");
    }

    private static boolean isPalindrome(int x) {
        boolean result = false;
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        String revs = sb.reverse().toString();
        if(s.equals(revs)) {
            result  = true;
        }

        return result;
    }
}
