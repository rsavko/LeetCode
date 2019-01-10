package com.leetcode.problem11;

public class Solution {
    public int maxAreaSlow(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int w = j - i;
                int h = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, w * h);
            }
        }
        return maxArea;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
