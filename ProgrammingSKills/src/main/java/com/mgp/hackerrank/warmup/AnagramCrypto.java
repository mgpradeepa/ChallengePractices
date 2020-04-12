package com.mgp.hackerrank.warmup;

public class AnagramCrypto {

    public static void main(String[] args) {


//        String s1 = "abc";
//        String s2 = "bad";
        String s1 = "nmyvym"; // n y v y
        String s2 = "mbmgpm";  // b m g p
/**
 *  n = 1
 *  m = 5
 *  v = 1
 *  y = 2
 *  b = 1
 *  g = 1
 *  p = 1
 */
//        String s1 = "fcrxzwscanmligyxyvym";
//        String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
//// f

        checkForAnagramCrypt(s1, s2);
    }

    private static void checkForAnagramCrypt(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        int removalbes =0;

        int [] cars2 = new int[256];
        int [] cars1 = new int[256];
        for (int i = 0; i <aLength ; i++) {
            int ch = a.charAt(i);
            cars1[ch] = cars1[ch] +1;

        }
        for (int i = 0; i <bLength ; i++) {
            int ch = b.charAt(i);
            cars2[ch] = cars2[ch] +1;

        }
        for( int i = 97 ; i < 256; i++) {

            if(cars1[i] != cars2[i]) {
                removalbes+= Math.abs(cars1[i] -cars2[i]);
            }
        }

//
        System.out.println(removalbes);
    }


}
