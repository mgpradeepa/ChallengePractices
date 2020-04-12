package com.mgp.hackerrank.warmup;

public class BinarySearchAlgo {

    public static void main(String args[]) {
        int [] arr = {1,3,4,5,7,9};
        int key = 0;

        System.out.println(binarySearch(key, arr, 0, arr.length));

    }

    private static int binarySearch(int key, int[] arr, int l , int r ){
        if(r >= 1) {
            // now proceed for binarySa
            int mid = l + (r -1)/2;

            if(arr[mid]  == key) return mid;

            if(arr[mid] > key){
                return binarySearch(key, arr, l, r-1);
            }
            return binarySearch(key, arr, mid+1, r);

        }
        return -1;
    }
}
