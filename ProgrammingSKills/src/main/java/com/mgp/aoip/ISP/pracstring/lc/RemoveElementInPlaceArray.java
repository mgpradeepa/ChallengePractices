package com.mgp.aoip.ISP.pracstring.lc;

import org.jetbrains.annotations.NotNull;

public class RemoveElementInPlaceArray {
    // Remove all the occurance of the given element.
    // *** You cannot use extra space or temp storage to store array elements
    // Which also describes the elements should be removed 'in-place'

    private static int removeElements(int @NotNull [] nums, int ele) {
        int ct = 0;
        for(int i = 0 ;i < nums.length; i++ ) {
            if(nums[i] != ele) {
                nums[ct++] = nums[i];
            }

        }
        return ct;
    }

    public static void main(String[] args) {
        int[]  nums = {1,2,3,3,2,5};
        int ele = 3;
        int result = removeElements(nums,ele);
        for(int i = 0 ; i < result; i++) {
            System.out.println(nums[i]);
        }
    }
}
