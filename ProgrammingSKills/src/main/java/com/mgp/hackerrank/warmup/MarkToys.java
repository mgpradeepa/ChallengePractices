package com.mgp.hackerrank.warmup;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;
        import java.util.stream.Collectors;
public class MarkToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

//        List<Integer> pl = Arrays.stream(prices)
//                .boxed().sorted().collect(Collectors.toList());
//        pl.forEach(System.out::println);
//        if(pl.get(0) > k) return 0;
//        else if ( pl.get(0) ==k) return 1;
//        int l = -1;
//        int sum = 0;
//        int count = 0;
//        for(int i = 0 ;i < pl.size(); i++ ) {
//            sum =0 ;
//            for(int j = i; j != -1   && j<pl.size()-1  ; j++ ) {
//                if(pl.get(j) >=k) break;
//                sum = sum +pl.get(j);
//                if(sum >= k &&  sum+pl.get(j+1)>=k ) {
//                    count++ ;
//                    j = -1;
//                    break;
//                }
//
//            }
//        }
//        return count;

        int count = 0 ; int sum = 0 ;
        Arrays.sort(prices);
        for(int i = 0 ; i < prices.length; i++ ){
            if(sum <= k) {
                sum+=prices[i];
                count++;
            }
        }
        return count -1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);

        scanner.close();
    }
}

