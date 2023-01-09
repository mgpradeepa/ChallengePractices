package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Arrays;

public class IceCreamBarsCostsCoins {
    private static int maxIceCream(int[] costs, int coins) {
        // Sort the arrays so that we need nt have to go to and fro from the costs array
        // sum up the costs to match the coins

        Arrays.sort(costs);
        Arrays.stream(costs).forEach(System.out::println);

        int sum = 0 ;
        if(costs[0] > coins) return 0;

        int res = 0 ;
        for(int i =0 ;i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];

            } else return i;

        }
            return costs.length;

    }

    public static void main(String[] args) {
//        int [] costs = {1,6,3,1,2,5};
//        int coins = 20;

        int [] costs = { 1,3,2,4,1};
        int coins = 7;

        System.out.println("Result -> "+ maxIceCream(costs, coins));
    }
}
