package in.mgp.p;

public class FindMaxProfit {
    //List of number  -- 7 5 13 2 3 8`
    // prices f stock
    // 7 -> prce of stock day 1
    // 5 -->

    // buy  and then nly sell
    // maximise the profit
    //

    //  7 5 dif =  2
    // 5 dif 2 = 3
    // 2 diff 3  rai 1
    public static void main(String... args) {
        int[] a = {7, 5, 13, 2, 3, 8};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] a) {
        // cur and the smallest before
        //List of number  -- 7 5 13 2 3 8`

        // maxprofit  8
        int minSofar = a[0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < a.length - 1; i++) {
            minSofar = Math.min(minSofar, a[i]);
            profit = a[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;


    }

}
