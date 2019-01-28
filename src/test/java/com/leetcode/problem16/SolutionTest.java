package com.leetcode.problem16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("3Sum Closest")
class SolutionTest {

    @Test
    void threeSumClosest() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        int actual = new Solution().threeSumClosest(nums, target);
        assertEquals(expected, actual);
    }
}