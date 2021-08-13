package com.mgp.hackerrank.warmup;

public class MaxArraySumWithHop {
    public static void main(String[] args) {
        // given array find the sub array sum such that every alternate indicies are considered for evaluation
        // arr = [-2,1,3,-4,5]
        /*
        Subset      Sum
[-2, 3, 5]   6
[-2, 3]      1
[-2, -4]    -6
[-2, 5]      3
[1, -4]     -3
[1, 5]       6
[3, 5]       8

         result = 8
         Kind of sol --> Dynamic programming
         */

        int arr[] = {-2, 1, 3, -4, 5};
        int expectedAnswer = 8;
        int obtainedAnswer = maxSubSetSum(arr);

        System.out.println("expected --> " + expectedAnswer + ":: obtained --> " + obtainedAnswer);


    }

    private static int maxSubSetSum(int arr[]) {

        int res[] = new int[arr.length];

        if (arr.length == 0) return arr[0];

        res[0] = arr[0];
        res[1] = arr[1] > arr[0] ? arr[1] : arr[0];

        for (int i = 2; i < arr.length; i++) {
            res[i] = Math.max(arr[i - 2] + arr[i], Math.max(res[i], Math.max(res[i - 1], res[i - 2])));
        }


        return res[res.length - 1];
    }
}
