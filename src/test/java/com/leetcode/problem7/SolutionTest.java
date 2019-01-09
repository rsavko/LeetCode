package com.leetcode.problem7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reversePositive() {
        int input = 123;
        int expected = 321;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseNegative() {
        int input = -123;
        int expected = -321;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void noLeadingZero() {
        int input = 120;
        int expected = 21;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void overflow() {
        int input = Integer.MAX_VALUE;
        int expected = 0;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }
}