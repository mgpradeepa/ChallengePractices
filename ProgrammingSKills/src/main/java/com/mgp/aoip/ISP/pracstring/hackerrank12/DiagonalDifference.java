package com.mgp.aoip.ISP.pracstring.hackerrank12;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(13);
        l2.add(14);
        l2.add(-1);
        l2.add(4);

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(l1);
        finalList.add(l2);

        System.out.println(absDiffOfDiagonalMatrix(finalList));
    }

    private static int absDiffOfDiagonalMatrix(List<List<Integer>> finalList) {
        int n = finalList.size();
        int[][] mat = finalList.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);


        return    Math.abs(primDiag(mat,n)- secDiag(mat,n));

    }

    private static int primDiag(int mat[][], int n ){

        int pd =0;
        for(int i = 0 ; i < n; i++) {

            for(int j = 0 ; j < n ; j++) {
                if(i == j ) {
                    pd = pd + mat[i][j];
                }
            }

        }
        return pd;
    }

    public static int secDiag(int mat[][], int n ){

        int sd =0;
        for(int i = 0 ; i < n; i++) {

            for(int j = 0 ; j < n ; j++) {
                if((i+j ) == (n-1)) {
                    sd = sd + mat[i][j];
                }
            }

        }
        return sd;
    }

}
