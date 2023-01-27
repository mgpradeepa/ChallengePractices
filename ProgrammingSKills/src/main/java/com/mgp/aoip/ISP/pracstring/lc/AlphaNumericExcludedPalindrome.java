package com.mgp.aoip.ISP.pracstring.lc;

public class AlphaNumericExcludedPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("1A man, a plan, a canal: Panama1"));
        System.out.println(isPalindrome("1A man,"));
    }
    private static  boolean isPalindrome(String s) {
        // removal of all non alphanumeric character
        // create a separate string
        // check for palindrome

        String ls  = s.toLowerCase();

        StringBuilder alpnum = new StringBuilder();
        for(int i = 0 ; i < ls.length(); i++){
            char c = ls.charAt(i);
            if((c >= 48 && c <= 57) || (c >=65  && c<= 90) || (c>=97 && c<=122)) {
                alpnum.append(c);
            }
        }

        String alpnumStr = alpnum.toString();

        if(alpnumStr.length() == 0) {
            return true;
        }
        String revaplNum = alpnum.reverse().toString();

        return alpnumStr.equals(revaplNum);
    }
}
