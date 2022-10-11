package com.mgp.aoip.ISP.pracstring.lc;

import java.util.*;

public class SumOfThreeTargetToZero {

    private static List<List<Integer>>  threeSumToZero(int[] nums) {
       int len = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        if(len == 0) {
            return new ArrayList<>(result);

        }
        Arrays.sort(nums);

        for(int i = 0 ; i < len -2; i++){
            int j = i+1;
            int k = len-1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0 ){
                    result.add(Arrays.asList(nums[i], nums[j++] , nums[k--]));
                }
                else if(sum >0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }

        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
//        int[] nums = new int[] {0,0,0};

        int[] nums = new int[] { -1,0,1,2,-1,-4};
       List<List<Integer>> result =  threeSumToZero(nums);
       result.forEach(x -> x.forEach(System.out::println));
    }
}
