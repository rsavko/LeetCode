package com.leetcode.problem34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find First and Last Position of Element in Sorted Array")
class SolutionTest {

    @Test
    @DisplayName("Target exists in array")
    void searchRangeWithTargetExists() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = new int[]{3, 4};
        int[] actual = new Solution().searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Target exists in array at the end")
    void searchRangeWithTargetExists2() {
        int[] nums = new int[]{5, 7, 7, 8, 10, 10};
        int target = 10;
        int[] expected = new int[]{4, 5};
        int[] actual = new Solution().searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Target not exists in array")
    void searchRangeWithTargetNotExists() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = new int[]{-1, -1};
        int[] actual = new Solution().searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Target not exists in array with 2 elements")
    void searchRangeWithTargetNotExists2() {
        int[] nums = new int[]{2, 2};
        int target = 1;
        int[] expected = new int[]{-1, -1};
        int[] actual = new Solution().searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for target in empty array")
    void searchRangeInEmptyArray() {
        int[] nums = new int[]{};
        int target = 6;
        int[] expected = new int[]{-1, -1};
        int[] actual = new Solution().searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }
}