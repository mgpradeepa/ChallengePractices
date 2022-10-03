package com.mgp.aoip.ISP.pracstring.lc;

public class MinimumTimeToMakeBaloonColorFul {
    private static int minCost(String colors, int[] neededtime) {
        int totalTime = 0;
        char[] color = colors.toCharArray();
        // first consider for two color array

        int size = color.length;

        if(size < 2) {

            if(color[0] != color[1]) {
                return totalTime;
            }
            else {
                return neededtime[1];
            }
        }

        for(int i = 1; i < size; i++ ) {
            if(color[i] == color[i-1]) {
                totalTime += Math.min(neededtime[i], neededtime[i-1]);
                neededtime[i]= Math.max(neededtime[i], neededtime[i-1]);
            }
        }

        return totalTime;
    }


    public static void main(String... args) {
        int[] time = {1,2,3};
        String color = "abc";
        String color1 = "abaac";
        int[] time1 = {1,2,3,4,5};
        int result1 = minCost(color1,time1);
        int result = minCost(color,time);


        assert minCost(color1,new int[] {1,2,3,4,5}) == 3;
        assert minCost(color ,new int[] {1,2,3}) == 0;


        System.out.println(result +" .. " + result1);
    }
}
