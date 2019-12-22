package com.leetcode.problem283;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length > 0) {
            int i = 0;
            int len = nums.length;
            while (i < len && nums[i] != 0) {
                i++;
            }
            for (int j = i + 1; j < len; j++) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
            }
        }
    }
}
