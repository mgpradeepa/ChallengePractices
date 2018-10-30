package com.mgp.gfg.prac;

import java.util.Scanner;

/**
 * Created by mgpradeepa on 27/10/18.
 */
public class IronManPalindrome {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i =0;i <T; i++) {
            String inp = sc.nextLine();
           if(isPalindrome(inp)){
               System.out.println("YES");
           }else System.out.println("NO");

        }
    }

    private static boolean isPalindrome(String s){
        String ns= s.replaceAll("[^A-Za-z0-9]", "");
        ns = ns.toLowerCase();
        boolean pal = Boolean.TRUE;
        System.out.println(ns);
        for(int i = 0,  j = ns.length() - 1; i < j; i++, j--){
            if(ns.charAt(i) != ns.charAt(j)) {

                pal = Boolean.FALSE;
                break;
            }
            else pal = Boolean.TRUE;
        }
return pal;
    }
}
