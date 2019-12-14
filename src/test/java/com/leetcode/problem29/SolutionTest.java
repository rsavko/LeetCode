package com.leetcode.problem29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Divide Two Integers")
class SolutionTest {

    @Test
    @DisplayName("Divide two positive numbers")
    void test1() {
        int dividend = 10, divisor = 3;
        int expected = 3;
        int actual = new Solution().divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Divide positive by negative")
    void test2() {
        int dividend = 7, divisor = -3;
        int expected = -2;
        int actual = new Solution().divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Divide Integer.MIN_VALUE by -1")
    void test3() {
        int dividend = -2147483648, divisor = -1;
        int expected = 2147483647;
        int actual = new Solution().divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Divide Integer.MIN_VALUE by 1")
    void test4() {
        int dividend = -2147483648, divisor = 1;
        int expected = -2147483648;
        int actual = new Solution().divide(dividend, divisor);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Divide -1 by 1")
    void test5() {
        int dividend = -1, divisor = 1;
        int expected = -1;
        int actual = new Solution().divide(dividend, divisor);
        assertEquals(expected, actual);
    }
}