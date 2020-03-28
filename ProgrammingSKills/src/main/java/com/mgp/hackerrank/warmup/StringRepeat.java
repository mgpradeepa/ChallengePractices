package com.mgp.hackerrank.warmup;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class StringRepeat {



    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) { // n= 10
        int stringLength = s.length(); //aba
        long a_counts = findNumberOfAs(s); //2
        long finalAs = 0;


        if(stringLength > 1) {
            long diff = n % stringLength; // 1
            long quot = n/ stringLength;
            finalAs += quot * findNumberOfAs(s);

            for (int len = 0 ; len< diff ; len++ ){
                if(s.charAt(len) == 'a') {
                    finalAs++;
                }
            }


        }else {
            if (s.charAt(0) == 'a') {
                finalAs = findNumberOfAs(s);
            }
        }

        return finalAs;
    }

    private static long findNumberOfAs(String s) {
        int as = 0 ;
        for (int i = 0 ; i < s.length(); i++ ) {
            if(s.charAt(i) =='a') {
                as++;
            }
        }
        return as;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println(result);
        scanner.close();
    }
}
