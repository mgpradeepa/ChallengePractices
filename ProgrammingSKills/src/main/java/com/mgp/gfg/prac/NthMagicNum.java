package com.mgp.gfg.prac;

public class NthMagicNum {
    public static void main(String[] args) {
        int n = 5;
        // series is 5,25,30,125,130 ...
        // pow(5)
        // sum of unique pow(5)
        System.out.println(nthMagicNum(n));
    }

    private static int nthMagicNum(int n) {

        int ans = 0;
        int powers =1;

        // do bitwise &ing from 1 to n but rightshift n value everytime of the loop

        while( n!=0){
            powers = powers* 5;
            if((n&1) == 1) {
                ans +=powers;
            }
            n>>=1;
        }

        return ans;
    }
}
