package com.mgp.aoip.ISP.pracstring.lc;

public class SingkeDuplicateNumber {
    // single number will have the occurance of 1   rest wil have more than that

    private static int singleMissingNumber(int[] nums) {
        int res = 0;
        for(int n : nums){
            res ^=n;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,2,3};
        System.out.println(singleMissingNumber(n));

    }
}
