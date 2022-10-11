package com.mgp.aoip.ISP.pracstring.lc;

public class IncreasingTriplet {
    // find the increasing triplet if i < j < k and n[i] < n[j] < n[k]
    // if present return true else false

    // APPROACH:  on the go of iteration, consider two progressive indexes.
    // to see if they are in triplet sequence evaluate the first number with the MAX_VALUE
    // if the second occurred number is greater than the first and lesser than the MAX_VALUE or the current bigger then consider that is in the sequence.
    // the third number should follow the same but should be present after the first two.

    private static boolean increasingTriplet(int[] n) {
        int f = Integer.MAX_VALUE;
        int fn = Integer.MAX_VALUE;

        for(int d : n ) {
            if( d <= f) {
                f = d;
            }else if( d <= fn) {
                fn = d;
            }
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] n = new int [] {1,2,3,4,5};
        int[] n1 = new int [] {1,6,3,2,1};

        boolean result = increasingTriplet(n1);
        System.out.println(result);
    }
}
