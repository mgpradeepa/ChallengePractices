package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Abbreviation {
    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
        // Matrix approach
        boolean mat[][] = new boolean[b.length()+1][ a.length()+1] ; // 1 indexed

        mat[0][0]= true;
        for(int j = 1; j < mat[0].length ; j++ ){
            if(Character.isLowerCase(a.charAt(j-1)))
                mat[0][j] = mat[0][j-1];

        }

        for(int i = 1 ; i < mat.length; i++) {
            for(int j = 1; j < mat[0].length; j++ ){
                char alo = a.charAt(j-1) , blo = b.charAt(i-1);
                if(alo >= 'A' && alo <= 'Z') {
                    if(alo == blo){
                        mat[i][j] = mat[i-1][j-1];

                    }
                }
                else {
                    alo = Character.toUpperCase(alo);
                    if(alo == blo)
                        mat[i][j] = mat[i-1][j-1] || mat[i][j-1];
                    else mat[i][j] = mat[i][j-1];

                }
            }
        }

        return mat[b.length()][a.length()] ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);
            System.out.println(result);
        }


        scanner.close();
    }
}
