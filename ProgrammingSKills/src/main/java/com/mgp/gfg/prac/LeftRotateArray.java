package com.mgp.gfg.prac;

public class LeftRotateArray {
    // array = [1,2,3,4]
    // index to rotate = 2
    // op = [3,4,1,2]

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        int ro = 2;
        rotateLeft(ar, ro);

    }

    private static void rotateLeft(int[] a, int d) {
        // fornow using multiple arrays as temp and result.
        // space comeplexity compromised

        int n = a.length;
        int[] temp = new int[n];
        int[] res = new int[n];
        int j= 0,k = 0;
        int newro = d-1;

        for(int i = 0; i <n; i++){
            if(i <= newro){
                temp[i] = a[i];
                k++;
//                continue;
            }
            else{
                res[j++] = a[i];
            }
        }

        int l = 0 ;
        while(j< n && l < k ) {
            res[j++] = temp[l++];
        }


        displayArray(res);

    }

    private static void displayArray(int[] res) {
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
