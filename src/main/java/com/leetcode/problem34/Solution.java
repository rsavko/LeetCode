package com.leetcode.problem34;

public class Solution {
    int[] empty = {-1, -1};

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return empty;
        }
        return searchRange(nums, target, 0, nums.length - 1);
    }

    private int[] searchRange(int[] nums, int target, int low, int high) {
        if (low > high) {
            return empty;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            int left = mid;
            int right = mid;
            while (left >= 0 && nums[left] == target) {
                left--;
            }
            while (right <= high && nums[right] == target) {
                right++;
            }
            return new int[]{left + 1, right - 1};
        } else if (nums[mid] > target) {
            return searchRange(nums, target, 0, mid - 1);
        } else {
            return searchRange(nums, target, mid + 1, high);}
    }
}
