package com.leetcode.problem11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = new Solution().maxArea(input);
        assertEquals(expected, actual);
    }

    @Test
    public void maxArea2() {
        int[] input = new int[]{1, 1, 1};
        int expected = 2;
        int actual = new Solution().maxArea(input);
        assertEquals(expected, actual);
    }
}