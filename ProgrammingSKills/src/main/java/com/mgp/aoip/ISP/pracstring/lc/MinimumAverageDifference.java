package com.mgp.aoip.ISP.pracstring.lc;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        int[] num = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(num));
    }

    private static int minimumAverageDifference(int[]nums){
        int lenth = nums.length;
        int res = 0;

        long min = Integer.MAX_VALUE, sum =0, left = 0, right;
        for(int n : nums) {
            sum+= n;
        }

        for(int i = 0 ; i < lenth; i++) {
            left += nums[i];
            right = sum -left;

            long diff = Math.abs(left /(i+1) - (lenth -i ==1 ? 0 : right /(lenth - i - 1)));

            if(diff < min) {
                min  = diff;
                res = i;
            }


        }

        return res;
    }


}
