package com.mgp.gfg.prac.gts;


public class ContainerWithMostWater {
    public static void main(String... args ) {
        int[] A = {1,5,4,3};
        int N = 4; // length of the array
        System.out.println(maxArea(A, N));
    }

    private static long maxArea(int[] a, int n) {
        long result = 0L;
        if( a == null || n < 2) return result;

        int max = 0;
        int left = 0 ;
        int right = n-1;

        while(left < right) {
            max = Math.max(max, Math.min(a[left], a[right]) *(right - left));
            if(a[left] <= a[right]){
                left++;

            }
            else right--;

        }
        result = (long) max;
        return result;


    }
}
