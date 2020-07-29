package com.mgp.hackerrank.warmup;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class ArrayCrush {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int m, int[][] queries) {
        long[] arr = new long [n];
        int low ;
        int high;
        int k;

        // initialize wiht 0s
        for(int i = 0; i < n ; i++ ) arr[i] = 0;

        for(int i = 0; i < m ; i ++) {
            low = queries[i][0];
            high = queries[i][1];
            k = queries[i][2];

            arr[low-1]+=k;

            if(high < n )  arr[high] -= k;

        }
        long max = 0 ;
        long temp = 0;

        for(int i = 0 ; i < n; i++) {
            temp += arr[i];
            if(temp > max) max = temp;

        }
return max;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n,m,  queries);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
