package com.leetcode.problem11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Container With Most Water")
class SolutionTest {

    @Test
    void maxArea() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = new Solution().maxArea(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxArea2() {
        int[] input = new int[]{1, 1, 1};
        int expected = 2;
        int actual = new Solution().maxArea(input);
        assertEquals(expected, actual);
    }
}