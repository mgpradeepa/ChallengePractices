package com.mgp.gfg.prac;

import java.util.Arrays;

public class TargetToSumInSingleArray {

    public static void main(String[] args) {
        int [] array = {1,3,4,7};
        int target = 5;
        Arrays.stream(targetToSum(array, target)).forEach(System.out::println);
    }
    private static int[] targetToSum(int[] nums, int target) {
        int[]result = new int[2];
        int size = nums.length;
        for(int i = 0; i < size;i++) {
            for(int j =0; j < size; j++) {
                if(target == nums[i] + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
