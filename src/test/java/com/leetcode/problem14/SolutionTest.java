package com.leetcode.problem14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Longest Common Prefix")
class SolutionTest {

    @Test
    void longestCommonPrefix() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void noLongestCommonPrefix() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixWithOneElement() {
        String[] input = new String[]{"dog"};
        String expected = "dog";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixWithNoElement() {
        String[] input = new String[]{};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixEmptyElement() {
        String[] input = new String[]{"", ""};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixEmptyElements() {
        String[] input = new String[]{"", null};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixWithSameElements() {
        String[] input = new String[]{"c", "c"};
        String expected = "c";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
}