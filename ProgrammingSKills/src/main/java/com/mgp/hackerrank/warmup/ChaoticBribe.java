package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ChaoticBribe {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        System.out.println("Begins");

        int bribe = 0;
        int i = 0 ;
        int n = q.length;
        int newI = 0;
        while ( i < n && i+1 < n  ){
            if(q[i] < q[i+1] ) newI++;
            else {
                if(q[i] > q[i+1]) {
                    if(q[i] - q[i+1] ==1) {
                        bribe++;
                    }
                    if(i+2 < n){
                        if(q[i] > q[i+2] && q[i] - q[i+2] ==2){
                            bribe++;
                            newI = i+2;
                        }
                    }
                    if(i+3 < n ){
                        if(q[i] > q[i+3] && q[i]- q[i+3] ==3) {
                            bribe = -1;
                            break;
                        }
                    }

                }
            }
            i = newI;

        }

        if(bribe <0) {
            System.out.println("Too Chaotic");
        }else {
            System.out.println(bribe);
        }

        }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
