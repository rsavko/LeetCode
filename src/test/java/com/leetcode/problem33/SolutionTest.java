package com.leetcode.problem33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Search in Rotated Sorted Array")
class SolutionTest {
    @Test
    @DisplayName("Should return positive index of element which exists")
    void searchSuccessful() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        int actual = new Solution().search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return negative index of element which does not exist")
    void searchUnsuccessful() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int actual = new Solution().search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search within empty array")
    void searchEmptyArray() {
        int[] nums = new int[0];
        int target = 3;
        int expected = -1;
        int actual = new Solution().search(nums, target);
        assertEquals(expected, actual);
    }
}