package com.mgp.hackerrank.warmup;

import java.util.Scanner;

public class ChaoticBribReverseWay {

        // Complete the minimumBribes function below.
        static void minimumBribes(int[] q) {

            int bribes = 0;

            // consider the sorted array and the mispositions of the values
            for(int i = q.length-1; i>=0; i--) {
                // no bribes
                if(q[i] != i+1 ) {

                    if((i-1 >= 0) && q[i-1] == i+1 ) {
                        // bribed once
                        bribes++;
                        // sort back to the original positon
                        swapToOriginal(q, i-1,i) ;
                    }
                    else if((i-2 >= 0) && q[i-2] == i+1) { // bribed twice
                        bribes +=2;
                        // need to swap twice so that u can track the other values
                        // whether they got swapped alloed number of times
                        swapToOriginal(q,i-2,i-1);
                        swapToOriginal(q, i-1,i);

                    }
                    else {
                        System.out.println("Too chaotic");
                        return;
                    }



                }

            }
            System.out.println(bribes);

    }

    private static void swapToOriginal(int[] q, int i, int i1) {
            int temp = q[i];
            q[i] = q[i1];
            q[i1] = temp;
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

