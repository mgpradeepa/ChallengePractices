package com.mgp.gfg.prac.gts;

public class FindMaxProfit {
    public static void main (String ...args) {
        // given array of number -- 7 5 13 2 3 8  which are stock price at each day
        // there should be a buy before a sell .
        // assess which would be te best max profit gainer
        int a [] = {7,5,13,2,3,8};
        System.out.println(maxProfit(a));


    }

    private static int maxProfit(int[]  a) {
        int maxProfit = 0;
        int minSofar = a[0];

        for(int i = 0; i < a.length -1 ; i++) {
            minSofar = Math.min(minSofar , a[i]);
            int profit = a[i] - minSofar;
            maxProfit = Math.max(profit, maxProfit);

        }
        return maxProfit;
    }


}
