package com.mgp.gfg.prac;

public class RightRotateArray {
    public static void main(String[] args) {
//        int[] A  = {1, 2,3, 4, 5, 6};
        int A[] = {3, 8, 9, 7, 6};
        int n = A.length;
        int d = 3;
        int B[] = rightRotate(A, n , d);
        for(int x :B ) {
            System.out.print( x + ",");
        }

    }
    private static int[] rightRotate(int[]A, int n, int d){
        for(int i = n ; i > d; i--) {
            rotateRightByOne(A, n );
        }

        return A;
    }
    private static void rotateRightByOne(int[]A, int n){
        int i , temp;
        temp = A[0];
        for( i = 0 ; i < n -1; i++){
            A[i] = A[i+1];
        }
        A[i] = temp;
    }
}
