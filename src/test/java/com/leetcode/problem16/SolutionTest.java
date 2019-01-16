package com.leetcode.problem16;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSumClosest() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        int actual = new Solution().threeSumClosest(nums, target);
        assertEquals(expected, actual);
    }
}