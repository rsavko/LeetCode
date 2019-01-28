package com.leetcode.problem5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Longest Palindromic Substring")
class SolutionTest {

    @Test
    void longestPalindrome() {
        String input = "babad";
        String expected = "bab";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome2() {
        String input = "cbbd";
        String expected = "bb";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome3() {
        String input = "babcd";
        String expected = "bab";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    void oneElement() {
        String input = "a";
        String expected = "a";

        String actual = new Solution().longestPalindrome(input);
        assertEquals(expected, actual);
    }
}