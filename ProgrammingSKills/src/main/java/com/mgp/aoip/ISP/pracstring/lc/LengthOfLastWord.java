package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println("Input a word");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("result -> " + l.lolw(s));
    }
    public int  lolw(String s) {
        String strim = s.trim();
        char[] c = strim.toCharArray();
        int count = 0 ;
        int len = c.length;
        if(len == 1 ) return 1;
        for(int i = c.length-1; i>=0; i--) {
            if(c[i] != ' ') count++;
            else break;
        }
        return count;
    }
}
