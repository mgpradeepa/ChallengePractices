package com.mgp.aoip.ISP.pracstring.lc;

public class SearchInsertPosition {

    // search for the given target in the sorted array.
    // If found return the index.
    // Else return the suitable index where the target can be inserted.
    // O(log n)
    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the mid
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
        }
        return end +1;
    }

    public static void main (String... args) {
        int target = 5;
        int[] num = new int[] {1,3,5,6};
        System.out.println("index -> " + searchInsert(num, target));
    }
}
