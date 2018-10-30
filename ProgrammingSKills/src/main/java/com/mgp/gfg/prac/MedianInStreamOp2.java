package com.mgp.gfg.prac;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class MedianInStreamOp2 {
    static int totalEle = 0;
    public static void main  (String ...args ){

        // find the median for a array for each given input

        Scanner sc = new Scanner(System.in);
        totalEle = sc.nextInt();
        // create an array of the given size
        int a[] = new int [totalEle];
        int b[];

        int newA[] = new int[1];

        int j;

        for(int i =0; i< totalEle; i++  ) {
            a[i] = sc.nextInt();

        }
         newA [0] = a[0];
        System.out.println(a[0]);
        for(int i =1; i < totalEle ; i++ ){
            j =i+1;
            b = mergeAndSort(newA,a[i]);

            System.out.println(findTheMedian(b, j));
        }
    }
    private static int findTheMedian(int[] b, int curLen) {
        int median;
        int medIndex = (curLen +1 ) /2;

        if(isEven(curLen)){

            // find (n+1)/2 th value
            // fetch the ciel of that number and -1 of that.
            // fetch the value from these two indexes in the arrya and get the avg of these two numbers
            int right = (int) Math.ceil(medIndex);
            int left = right -1;
            median = (b[left] + b[right])/2;
        }
        else {
            median = b[medIndex]; // for odd numbers
        }
        return median;


    }

    private static boolean isEven(int curLen) {
        return curLen %2 ==0 ?Boolean.TRUE : Boolean.FALSE;
    }

    private static int[] mergeAndSort(int curArray [], int curValue) {

        int mSArray[] = new int[curArray.length +2];

        int k = 0;
        int l =0;
        boolean checkDone = true;
        while (l< curArray.length && checkDone ) {
            if(curArray[l] < curValue) {
                mSArray[k] = curArray[l];
                l++;

            }
            else {
                checkDone = false;
                mSArray[k] = curValue;

            }
            k++;
        }

        while(l<curArray.length) {
            mSArray[k]=curArray[l];
            k++; l++;

        }
        if(checkDone) {
            mSArray[k] = curValue;
        }


        System.out.println(Arrays.toString(mSArray));
        return mSArray;

    }



}
