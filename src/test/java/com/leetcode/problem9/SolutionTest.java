package com.leetcode.problem9;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        int input = 121;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome2() {
        int input = 516615;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome3() {
        int input = 1;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void negativeIsNotPalindrome() {
        int input = -121;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    public void notPalindrome() {
        int input = 10;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    public void overflow() {
        int input = Integer.MAX_VALUE;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }
}