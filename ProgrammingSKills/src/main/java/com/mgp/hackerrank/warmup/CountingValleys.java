package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int res = 0;
        int move = 0;
        int val = 0;
        boolean underSea = Boolean.FALSE;

        for ( int i = 0; i < n; i++) {
            if(s.charAt(i) == 'U'){
                move++;
            }else {
                move--;
            }

            if(!underSea && move < 0 ) {

                underSea  = Boolean.TRUE;
            }
            if(underSea &&  move ==  0){
                val++;
                underSea = Boolean.FALSE;
            }
       }

        return val;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        System.out.println(result);
        scanner.close();
    }
}
