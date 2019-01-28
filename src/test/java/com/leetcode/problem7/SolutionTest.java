package com.leetcode.problem7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Reverse Integer")
class SolutionTest {

    @Test
    void reversePositive() {
        int input = 123;
        int expected = 321;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverseNegative() {
        int input = -123;
        int expected = -321;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void noLeadingZero() {
        int input = 120;
        int expected = 21;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void overflow() {
        int input = Integer.MAX_VALUE;
        int expected = 0;
        int actual = new Solution().reverse(input);
        assertEquals(expected, actual);
    }
}