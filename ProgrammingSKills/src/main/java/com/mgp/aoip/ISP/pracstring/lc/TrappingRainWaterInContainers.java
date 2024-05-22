package com.mgp.aoip.ISP.pracstring.lc;

public class TrappingRainWaterInContainers {
    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWaterInContainers tr = new TrappingRainWaterInContainers();
        System.out.println(tr.trap(height));
    }

    public int trap(int[] height) {
        int n = height.length;
        if(n ==0) return 0;
        int [] left = new int[n];
        int [] right = new int[n];

        int trappedWater =0;

        // Fill on left

        left[0] = height[0];
        for(int i = 1 ; i < n ; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        for(int i = 0 ; i < n ; i++) {
            trappedWater += Math.min(left[i], right[i]) - height[i];
        }
        return trappedWater;
    }
}
