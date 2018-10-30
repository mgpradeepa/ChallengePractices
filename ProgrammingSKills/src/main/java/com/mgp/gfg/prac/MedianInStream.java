package com.mgp.gfg.prac;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mgpradeepa on 20/10/18.
 */

/*
Flow in stream : 5, 15, 1, 3
5 goes to stream --> median 5 (5)
15 goes to stream --> median 10 (5, 15)
1 goes to stream --> median 5 (5, 15, 1)
3 goes to stream --> median 4 (5, 15, 1, 3)


Op -> print the floor of the new median in a new line.

 */
public class MedianInStream {
    static int totalEle = 0;

    public static void main  (String ...args ){

        // find the median for a array for each given input

        Scanner sc = new Scanner(System.in);
        totalEle = sc.nextInt();
        // create an array of the given size
        int a[] = new int [totalEle];
        int b[];

        int j;

        for(int i =0; i< totalEle; i++  ) {
         a[i] = sc.nextInt();
            j =i+1;
            b = Arrays.copyOf(a,j);
            System.out.println(findTheMedian(b, j));
        }
    }

    private static int findTheMedian(int[] b, int curLen) {
        int median;
        int medIndex = (curLen +1 ) /2;

         Arrays.sort(b);
        if(isEven(curLen)){

            // find (n+1)/2 th value
            // fetch the ciel of that number and -1 of that.
            // fetch the value from these two indexes in the arrya and get the avg of these two numbers
            int right = (int) Math.ceil(medIndex);
            int left = right -1;
            median = (b[left] + b[right])/2;
        }
        else {
            median = b[medIndex-1]; // for odd numbers
        }




        return median;


    }

    private static boolean isEven(int curLen) {
        return curLen %2 ==0 ?Boolean.TRUE : Boolean.FALSE;
    }


}
