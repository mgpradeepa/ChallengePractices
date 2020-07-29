package com.mgp.hackerrank.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SpecialString {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long res = 0;
        for( int i = 0 ; i < s.length(); i++){
            int checkLenght = 1;
            while(i - checkLenght >= 0 &&
                    i + checkLenght < n  &&
                    s.charAt(i -checkLenght ) == s.charAt(i-1) &&
                    s.charAt(i + checkLenght) == s.charAt( i-1)){
                res++;
                checkLenght ++;

            }
            int reoccur  = 0 ;
            while( i + 1 < n && s.charAt(i) == s.charAt(i+1)){
                reoccur++;
                i++;

            }
            res += reoccur * (reoccur+1)/2;


        }
        return res + n;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);
        System.out.println(result);

        scanner.close();
    }
}
