package com.mgp.aoip.ISP.pracstring.lc;

public class LastWordLength {

    private static int lengthOfLastWord(String s) {
        String[] sss = s.split(" ");
        int l = sss.length;
        if(l > 0) {
            return sss[l-1].length();

        }
        else return 0;
    }
    public static void main(String[] args) {
//        String input = "I had a morning coffee";
        String input = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input));
    }
}
