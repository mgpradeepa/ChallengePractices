package com.mgp.gfg.prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourOfFiveMinandMaxSum {
    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(1,3,5,7,9));
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        // sort th array

        Collections.sort((arr));
        // iterate over the array once.
        // for min - go from 0 to 3 and max -
        long minSum = 0;
        long maxSum = 0;
        for(int i = 0, j = 1 ; i < arr.size() && j < arr.size(); i++ , j++) {

            if(i < arr.size()-1) {
                minSum+= arr.get(i);

            }
            maxSum+= arr.get(j);


        }
        System.out.println(minSum +" " + maxSum);

    }


}
