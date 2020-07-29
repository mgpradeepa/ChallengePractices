package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class DicSubString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String toInHashset = null;
        String result = "NO";
        toInHashset = (s1.length() >= s2.length()) ? s1 : s2;
        String toCheckInHash = (s1.length() < s2.length()) ? s1 : s2;

        System.out.println(toInHashset + " ----->  >> " + toCheckInHash);

        Map<Character, Boolean> charMap = new HashMap<>(toInHashset.length());
        for(int i = 0 ; i < toInHashset.length(); i ++){
            charMap.put(toInHashset.charAt(i), Boolean.TRUE);

        }
        System.out.println("TCIH length "+toCheckInHash.length());
        for(int j =0 ; j < toCheckInHash.length(); j++) {
            System.out.println(" --> "+String.valueOf(toCheckInHash.charAt(j)));

        }
        for(int j =0 ; j < toCheckInHash.length(); j++) {
            System.out.println(" --> "+String.valueOf(toCheckInHash.charAt(j)));
            if(charMap.get(toCheckInHash.charAt(j) )== Boolean.TRUE){
                result = "YES";
                break;
            }

        }
        charMap.entrySet().forEach(System.out::println);


        return result;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);


        }


        scanner.close();
    }
}
