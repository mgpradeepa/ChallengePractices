package com.mgp.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSwap2{


        // Complete the minimumSwaps function below.
        static int minimumSwaps(int[] arr) {

            int swapCounter = 0;

            // temp [] to hold the indicies of the current values
            int n = arr.length;
//            int[] temp = new int[n];

//            for(int i = 0 ; i < n; i ++){
//                temp[arr[i]-1] = i;
//            }
//            display(temp);

            // 2 3 4 1 5
            // n = 5
            // a[i]
            // i = 0
            // (i < a[i]-1) ==> (0 < 2-1 => 1) >>> T
            // swap( 0, (5, 2-1)
            for(int i = 0 ; i < n ; i++) {
                if(i< arr[i]-1) {
                    swap(arr, i, Math.min(n, arr[i] -1)); // (0, min(5,1) =1
                    swapCounter++;
                    i--;
                }
            }



//        for(int i = 0; i < n; i++){
//            if(arr[i] != i+1) {
//                int t = temp[i];
//                arr[i] = i+1;
//                arr[t] = arr[i];
//
//                // temp
//                temp[i] = i;
//                temp[arr[t] -1 ] = t;
//
//                swapCounter+=1;
//            }
//        }

//            display(arr);
//            display(temp);
            return swapCounter;
        }

//        private static void swap(int[] arr, int i, int t) {
//            int tmp = arr[i];
//            arr[i] = arr[t];
//            arr[t] = tmp;
//        }
private static void swap(int[] arr, int i, int t) {
    int tmp = arr[i];
    arr[i] = arr[t];
    arr[t] = tmp;
}

//    private static void display(int a[]){
//        for(int i = 0 ;i <a.length;i++){
//            System.out.print(a[i] +" " );
//        }
//        System.out.println();
//
//    }
//
//        privatz̄e static void display(int a[]){
//            for(int i = 0 ;i <a.length;i++){
//                System.out.print(a[i] +" " );
//            }
//            System.out.println();
//
//        }
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int res = minimumSwaps(arr);


//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

            scanner.close();
        }
    }


