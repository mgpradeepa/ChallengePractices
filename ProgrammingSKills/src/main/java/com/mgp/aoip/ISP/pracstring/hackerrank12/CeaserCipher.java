package com.mgp.aoip.ISP.pracstring.hackerrank12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CeaserCipher {

    public static void main(String[] args) {
        String cleartext = "eat-madana-datE-madana";
        int k = 3;
        System.out.println("Encryted ceaser cipher message is " + encrypt(cleartext,k));

    }
    private static String encrypt(String s, int k ) {
        k = k % 26;

        List<Character> resut = new ArrayList<>();

        for(Character c: s.toCharArray()) {
            if(c.toString().matches("^[a-zA-Z]*$")){
                char t = (char)((int)(c)+ k);

                if((c>='A' && c <= 'Z' && t > 'Z') || (t >'z'))
                    t-= 26;

                c = t;

            }
            resut.add(c);

        }
        return resut.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
