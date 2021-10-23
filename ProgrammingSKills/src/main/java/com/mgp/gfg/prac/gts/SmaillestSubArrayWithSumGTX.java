package com.mgp.gfg.prac.gts;

public class SmaillestSubArrayWithSumGTX {
    public static void main(String[] args) {

        int n = 8;
        int x = 16;
//        int[] a= {1, 3, 4, 7, 10, 10, 8 ,10};
//        int[] a = {1, 4, 45, 6, 0, 19};
        int[] a = {6, 3 ,4 ,5 ,4 ,3 ,7, 9};
        System.out.println(smallestSubWithSum(a,n,x));
    }

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here
        // let i = 0 and j = i+1  --> two pointers
        // keep moving j until it does not reach n or the sum from i to j has exceeded x
        // have variable sum to keep calculating the sum from i to j++
        // initialize hopCount to interger.maxValue and calculate minimum hops per iteration and assign.
        // hopCount will be the result sent back
        int result = Integer.MAX_VALUE;
        // int i = 0;
        // int j = i+1;
        int hop = 0;
        // what if n is just 1
        if(n == 1 ) {
            return 1; // every time there is an answer which exists
        }

        // iterate over the array once
        for ( int i = 0; i<n; i++) {
            int sum =a[i];
            if(i != n-1) hop = 0;
            for( int j = i+1; j < n && sum <= x ; j++   ){

                System.out.println( "i -->  "+i  + "   j --> " +j);
                System.out.println( "a[i] -->  "+a[i] + "   a[j] --> " +a[j]);
                sum= sum + a[j];

                ++hop;
                System.out.println("Sum " + sum  + " hop -- " + hop);

            }

            result = Math.min(result, ++hop);
            System.out.println("Result --" + result  + " hop -- " + hop);
            System.out.println();

        }

        return result+1;
    }
}
