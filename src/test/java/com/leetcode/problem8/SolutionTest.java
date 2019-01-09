package com.leetcode.problem8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void simpleConvert() {
        String input = "42";
        int expected = 42;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void simpleConvertWithSign() {
        String input = "+1";
        int expected = 1;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void simpleConvertWithTwoSigns() {
        String input = "+-2";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void simpleConvertWithSigns() {
        String input = "++1";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void negativeWithWhitespaces() {
        String input = "   -42";
        int expected = -42;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void numberWithWords() {
        String input = "4193 with words";
        int expected = 4193;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void wordsWithNumber() {
        String input = "words and 987";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void overflow() {
        String input = "-91283472332";
        int expected = Integer.MIN_VALUE;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void overflow2() {
        String input = "-2147483647";
        int expected = -2147483647;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void combination() {
        String input = "  -0012a42";
        int expected = -12;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void combination2() {
        String input = "   +0 123";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void combination3() {
        String input = "-   234";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void combination4() {
        String input = "0-1";
        int expected = 0;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void combination5() {
        String input = "-5-";
        int expected = -5;
        int actual = new Solution().myAtoi(input);
        assertEquals(expected, actual);
    }
}