package com.mgp.aoip.ISP.pracstring.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {
    private static int[] intersectArrays(int[] nums1, int[] nums2) {
        // intersect two arrays.
        // the duplicate number of elements should be present as is.

        // SOLUTION
        // preferably consider it to have sorted. So the next next elements can be directly obrained and compared

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int x = nums1[i], y = nums2[j];
            if (x == y) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (x < y) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        Arrays.stream(intersectArrays(nums1, nums2)).forEach(System.out::println);
    }
}
