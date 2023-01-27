package com.mgp.hackerrank.warmup;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class AbsoluteDiff {


    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);
        System.out.println("Sorted arrr ---> " + arr);
        for (int i : arr) {
            System.out.print  (i + " " );

        }
        System.out.println();

        int initRes = 0;
        int result = 0;
        initRes = absDiff(arr[0],arr[1]);
        for(int i =1;  i < arr.length-1; i++ ) {
            if(i == 1) {
                result = Math.min ( initRes, absDiff(arr[i],arr[i+1]));
            }

            result =   Math.min ( result, absDiff(arr[i],arr[i+1]));

        }
        return result;
    }


    private static int absDiff(int a, int b) {

        return Math.abs(a-b);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);
        System.out.println("result ----- --> " +result);


        scanner.close();
    }
}