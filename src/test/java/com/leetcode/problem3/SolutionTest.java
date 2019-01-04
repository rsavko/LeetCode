package com.leetcode.problem3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String input = "abcabcbb";
        int expected = 3;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringShoulbBe1() {
        String input = "bbbbbbb";
        int expected = 1;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringShoulbBe3() {
        String input = "pwwkew";
        int expected = 3;
        int actual = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }


}