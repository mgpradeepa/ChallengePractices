package com.mgp.gfg.prac.gts;

public class SearchInASortedArray {
    public static void main(String[] args) {
        int N = 9;
        int[] A = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        Parihara parihara = new Parihara();
        System.out.println(parihara.search(A,0, N-1, key));

    }
}

class Parihara {
    public int search ( int[] A, int l, int h, int key ) {
        // Complete this function
        // can complete in O(n)
        // to calculate in O(logN) can use binary search technique
        int index = -1;
        for(int i = 0  ; i < A.length; i++ ){
            if(A[i]  == key )    {
                index = i;
            }
        }
        return index;

    }
}
