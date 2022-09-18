package com.mgp.aoip.ISP.pracstring.lc;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String toCheck = "bb";
        System.out.println(longestPalindrome(toCheck));
    }
    private static  String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        // take the substrings
        // for each substring find the palindrome
        // if a palindrome, calc the length of the string
        // compare with maxLength

        String result = new String(s);

        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1;j <  s.length(); j++) {
                String check = s.substring(i, j);
                int length = isPalindrome(check);
                int prevMax = maxLength;
                maxLength = Math.max(maxLength, length);
                if(prevMax <= maxLength) {
                    result = new String (check);
                }


            }

        }
        return result;
    }

    private static int isPalindrome(String valid) {
        StringBuilder sb = new StringBuilder(valid);
        String rev = sb.reverse().toString();
        int palLength = 0;
        if(valid.equals(rev)) {
            palLength = valid.length();
        }

        return palLength;
    }

}
