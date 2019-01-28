package com.leetcode.problem9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Palindrome Number")
class SolutionTest {

    @Test
    void isPalindrome() {
        int input = 121;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    void isPalindrome2() {
        int input = 516615;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    void isPalindrome3() {
        int input = 1;
        boolean actual = new Solution().isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    void negativeIsNotPalindrome() {
        int input = -121;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    void notPalindrome() {
        int input = 10;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }

    @Test
    void overflow() {
        int input = Integer.MAX_VALUE;
        boolean actual = new Solution().isPalindrome(input);
        assertFalse(actual);
    }
}