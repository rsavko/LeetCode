package com.leetcode.problem5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        String input = "babad";
        String expected = "bab";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestPalindrome2() {
        String input = "cbbd";
        String expected = "bb";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestPalindrome3() {
        String input = "babcd";
        String expected = "bab";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void oneElement() {
        String input = "a";
        String expected = "a";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }
}