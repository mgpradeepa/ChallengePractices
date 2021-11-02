package com.mgp.hackerrank.warmup;

import java.io.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;
        import java.math.*;

public class ArraCrush {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long max = 0;
        // int s = 1;
        // int e = 1;
        long[]  arr = new long[n];
        for (int i = 0;  i < n ;i ++) arr[i] =0;

        for(int i =0; i < queries.length; i++ ){

            int s = queries[i][0]  ;
            int e = queries[i][1]  ;
            long k = queries[i][2];
//
//            System.out.println("s --> " + s + " e --> " + e + " k --> " + k );
//            for(int aa = s; aa <= e; aa++){
//                arr[aa] = arr[aa] + k;
//                long newMax = arr[aa];
//                max = Math.max(max, newMax);
//
//            }
//

            arr[s] += k;
            if(e < n ) arr[e] -= k;

        }
        int temp = 0 ;
        int maxw = 0;

        for(int i =0; i < n; i++) {
            temp += arr[i]
;
            if(temp > maxw) max = temp;
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

        long result = arrayManipulation(n, queries);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
