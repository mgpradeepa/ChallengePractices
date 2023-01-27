package com.mgp.aoip.ISP.pracstring.lc;

public class ReshapeMatrix {
    private static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(r * c != m * n) {
            return mat;
        }
        int[][] res = new int[r][c];
        for(int i =0, k = 0, l = 0; i < m ; i++){
            for(int j =0; j < n; j++, l++) {
                if( l ==c) {
                    k++;
                    l =0;

                }
                res[k][l] = mat[i][j];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] result = reshapeMatrix(mat,r,c);

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(result[i][j] +" ") ;
            }
        }
    }
}
