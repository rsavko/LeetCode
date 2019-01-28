package com.leetcode.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Longest Substring Without Repeating Characters")
class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        String input = "abcabcbb";
        int expected = 3;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringShoulbBe1() {
        String input = "bbbbbbb";
        int expected = 1;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringShoulbBe3() {
        String input = "pwwkew";
        int expected = 3;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }


}