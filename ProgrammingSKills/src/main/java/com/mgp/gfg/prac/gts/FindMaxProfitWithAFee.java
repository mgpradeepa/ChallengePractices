package com.mgp.gfg.prac.gts;

public class FindMaxProfitWithAFee {

    public static void main (String... args) {
        int[] prices = {1, 3, 5, 7};
        int fee = 2;
        System.out.println(findMaxProfitWithAFee(prices, fee));

    }
    private static  int findMaxProfitWithAFee(int[] prices, int fee) {

        int buy =  Integer.MIN_VALUE;
        int sell = 0;


        for(int price: prices) {
            buy = Math.max(buy, sell-price);
            sell = Math.max(sell, buy+price-fee);
        }
        return sell;

    }
}
