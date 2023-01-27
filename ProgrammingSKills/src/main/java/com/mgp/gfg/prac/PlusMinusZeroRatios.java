package com.mgp.gfg.prac;

import java.util.Arrays;
import java.util.List;

public class PlusMinusZeroRatios {
    public static void main(String[] args) {

        plusMinus(Arrays.asList(-3, -4, 2,5,0));

    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        // check whether the numbers are positive and negative. perform the ratio

        int as = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for( int i = 0 ; i < as; i++){

            if(arr.get(i) == 0) {
                zero++;

            }else if(arr.get(i) < 0) {
                negative++;
            }else {
                positive++;
            }
        }

        double asa = (double)(as);
        double po = positive / asa;
        double ne = negative / asa;
        double ze = zero / asa;

        System.out.printf("%.6f \n", po);
        System.out.printf("%.6f\n", ne);
        System.out.printf("%.6f\n", ze);

    }

}


