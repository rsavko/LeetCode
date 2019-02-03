package com.leetcode.problem26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int startIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[startIndex]) {
                nums[++startIndex] = nums[i];
            }
        }
        return startIndex + 1;
    }
}
