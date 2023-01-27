package com.mgp.hackerrank.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CustomBubbleSort {
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numOfSwaps = 0;
        int n = a.length;


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {

                    numOfSwaps = numOfSwaps +1;
                    swap(j, j + 1, a);

                }
            }

        }
        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: "+ a[a.length-1] );

    }
    static void swap(int a, int b, int [] ar) {

        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }


}
