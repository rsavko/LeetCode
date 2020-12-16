package com.leetcode.problem53;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Maximum Subarray")
class SolutionTest {
    @Test
    @DisplayName("Finds max subarray")
    void maxSubArray() {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int actual = new Solution().maxSubArray(input);
        assertEquals(expected, actual);
    }
}