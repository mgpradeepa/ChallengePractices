package com.mgp.aoip.ISP.pracstring.lc;

import java.io.Reader;
import java.util.Scanner;

public class RemoveDuplicatesAtmostTwiceInPlaceArray {

    public static void main(String[] args) {
        RemoveDuplicatesAtmostTwiceInPlaceArray rd = new RemoveDuplicatesAtmostTwiceInPlaceArray();
        int [] nums = {1,1,2,2,3,3,3,4};
        System.out.println("result -> "+ rd.removeDuplicates(nums));

    }
    public int removeDuplicates(int[] nums) {
        int m = 0;
        for(int n: nums) {
            if(m < 2 || n != nums[m-2]){
                nums[m++] =n;
            }
        }
        return m;
    }


}
