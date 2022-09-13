package com.mgp.aoip.ISP.pracstring.lc;

public class RemoveDuplicatesFromSortedArrayInPlace {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0 || n ==1 ) {
            return n;
        }
        int j =0;
        for(int i = 0; i < n-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j++] = nums[i];

            }
        }
        nums[j++ ] = nums[n-1];

        return j;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,5,7,7,8};
        int result = removeDuplicates(nums);
        for(int i = 0; i< result ; i++) {
            System.out.println(nums[i]);
        }
    }
}
