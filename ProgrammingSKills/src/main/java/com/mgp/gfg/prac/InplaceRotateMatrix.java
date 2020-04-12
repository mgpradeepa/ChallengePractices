package com.mgp.gfg.prac;

public class InplaceRotateMatrix {

    public static void main(String[] args) {

//        int mat[] [] = new int [3][3];
        int matLength = 4;

        int mat[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        inplaceRotate(mat, matLength);

        displayMatrix(mat, matLength);


    }

    private static void inplaceRotate(int[][] mat, int n) {

        // rotation should go like an internal spiral
        // so section by section the rotation to be done
        // first outer -- inner -- inner if any

        // go through just half the number of items
        // no extra matrix to be used to place and publish

        /***
         * let say in 3*3 matrix
         * 00 <- 03
         * 03 <- 33
         * 33 <- 30
         * 30 <- 00
         *
         */



        for(int x = 0 ; x < n/2; x++) {

            for(int  y = x; y < n-x-1; y++ ){
                int temp = mat[x][y];

                mat[x][y] = mat [y][n-1-x];

                mat[y][n-1-x] = mat[n-1-x][n-1-y];

                mat[n-1-x][n-1-y] = mat [n-1-y][x];

                mat [n-1-y][x] = temp;

            }


        }

    }

    private static void displayMatrix(int[][] mat, int n) {
        for( int x = 0 ; x < n;x++) {
            for ( int y = 0; y < n;y++){
                System.out.print( mat[x][y] +" ");
            }
            System.out.println();
        }
    }



}
