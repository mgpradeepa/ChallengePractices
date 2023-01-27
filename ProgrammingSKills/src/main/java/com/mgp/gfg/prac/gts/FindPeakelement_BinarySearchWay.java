package com.mgp.gfg.prac.gts;

public class FindPeakelement_BinarySearchWay {
    // problem statement specifies to list the index and here we ty to find the element as well.

    public static void main(String... args) {
        int n = 3;// length f items in the array
        int[] arr = {1,2,3};

        System.out.println(peakElement(arr,n)) ;

    }

    private static  int peakElement(int[] arr, int n) {
        // use binary search technique
        if(arr == null || arr.length == 0 ) {
            System.exit(-1);
        }
        return  arr[peakElement(arr,0, n-1)];
    }

    private static int peakElement(int[] arr, int left, int right) {
        // as usual go with  l + r /2
        int mid = (left + right) / 2 ;

        // check if mid element is greater than its neighbours
        if((mid == 0 || arr[mid -1] <= arr[mid]) && (mid == arr.length -1 || arr[mid+1] <= arr[mid])) {
            return mid;
        }
        // if left neighbour of mid is higher go to left part
        if(mid -1 >= 0 && arr[mid-1] > arr[mid]) {
            return peakElement(arr, left, mid-1);

        }
        return peakElement(arr, mid+1, right);

    }
}
