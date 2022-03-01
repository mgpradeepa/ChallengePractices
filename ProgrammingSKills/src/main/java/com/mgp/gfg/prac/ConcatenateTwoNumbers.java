package com.mgp.gfg.prac;

import java.util.HashMap;
import java.util.Map;

public class ConcatenateTwoNumbers {

    public static void main(String ...args) {
        int N = 4;
        int numbers[] = {1, 212, 12, 12};
        int X = 1212;

        System.out.println(countPairs(N, X, numbers));
    }
    /**
     * Input:
     * N = 4
     * numbers[] = {1, 212, 12, 12}
     * X = 1212
     * Output:
     * 3
     * Explanation:
     * We can obtain X=1212 by concatenating:
     * numbers[0] = 1 with numbers[1] = 212
     * numbers[2] = 12 with numbers[3] = 12
     * numbers[3] = 12 with numbers[2] = 12
     *
     *
     */
    private static long countPairs(int N, int X, int numbers[]) {

        // stringize technique
        Map<String, Integer> map = new HashMap<>();
        // put the numbers into map inkey and count in value
        for(int i : numbers) {
            map.put(Integer.toString(i), map.getOrDefault(Integer.toString(i),0)+1);

        }

        // check for the presence
        String given = Integer.toString(X);
        long count = 0 ;
        for(int i = 0 ; i < given.length(); i++ ) {
            String fs = given.substring(0, i);
            String ss = given.substring(i);
            if(map.containsKey(fs) && map.containsKey(ss)) {
                if(fs.equals(ss)) {
                    int k = map.get(fs);
                    count += (long) (k * (k-1));

                }
                else {
                    count+= map.get(fs) * map.get(ss);
                }
            }
        }
            return count;
    }
}
