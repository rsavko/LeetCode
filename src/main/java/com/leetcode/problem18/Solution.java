package com.leetcode.problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // check https://github.com/leetcoders/LeetCode-Java/blob/master/4Sum.java
    // https://cheonhyangzhang.wordpress.com/2015/09/14/18-leetcode-java-4sum-medium/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + 3 * max < target) {
                continue; // nums[i] is too small
            }
            if (nums[i] * 4 > target) {
                break;//nums[i] is too big
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        // Handle duplicates
                        while (l < r && nums[l + 1] == nums[l]) l++;
                        while (l < r && nums[r - 1] == nums[r]) r--;
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
