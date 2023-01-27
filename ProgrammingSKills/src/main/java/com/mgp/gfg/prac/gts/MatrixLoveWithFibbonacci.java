package com.mgp.gfg.prac.gts;

public class MatrixLoveWithFibbonacci {
    public static void main(String[] args) throws Exception {
        // find the nth value  such that each number will be mod of 1000000007
        // also  interested in first two initial elements to be const to start at
        int n = 10;
        System.out.println("Heres my fibonacci love "+ fibboLove(n));
    }

    private static int fibboLove(int n) {
        int matty[] = new int[n+2];
        matty[0]= 0;
        matty[1] = 1;
        for(int i = 2; i <=n ; i++) {
            matty[i] = (matty[i-1] + matty[i-2]) % 1000000007;
        }
        return matty[n] % 1000000007;
    }
}
