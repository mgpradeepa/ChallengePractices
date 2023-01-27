package com.mgp.gfg.prac.gts;

// consider the array is sorted
public class FindLeftAndRightMostIndexEqTarget {
    public static void main(String... args) {
        // target
        int target = 8;
        int n = 9;
        int[] v = {1, 3, 5, 5, 5, 5, 67, 123, 125};

        Pair p = getIndexes(v ,target);
        System.out.println("Left --> " + p.left + "Right --> "+  p.right);
        // to be found in log(n) hence ideally a binary search problem
    }

    private static Pair getIndexes(int[] v, int target) {
        Pair result = null;
       int left = findStartIndex(v, target);
        int right = findEndIndex(v, target );

        result = new Pair(left, right);

        return result;
    }

    private static int findEndIndex(int[] v, int target) {
        int index = -1;

        int start = 0;
        int end = v.length -1;
        while (start <= end) {
            int midPoint = start + (end-start) /2 ; // overflow condition
            if(v[midPoint] <=  target) {
                start = midPoint+1;
            }
            else {
                end = midPoint -1 ;
            }
            if(v[midPoint] == target ) {
                index = midPoint;
            }
        }
        return index;

    }

    private static int findStartIndex(int[] v, int target) {
        int index = -1;

        int start = 0;
        int end = v.length -1;
        while (start <= end) {
            int midPoint = start + (end-start) /2 ; // overflow condition
            if(v[midPoint] >= target) {
                end = midPoint-1;
            }
            else {
                start = midPoint +1 ;
            }
            if(v[midPoint] == target ) {
                index = midPoint;
            }
        }


        return index;

    }
}
class Pair {
    int left, right;
    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
