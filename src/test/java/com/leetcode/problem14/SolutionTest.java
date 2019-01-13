package com.leetcode.problem14;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void noLongestCommonPrefix() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestCommonPrefixWithOneElement() {
        String[] input = new String[]{"dog"};
        String expected = "dog";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestCommonPrefixWithNoElement() {
        String[] input = new String[]{};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestCommonPrefixEmptyElement() {
        String[] input = new String[]{"", ""};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    public void longestCommonPrefixEmptyElements() {
        String[] input = new String[]{"", null};
        String expected = "";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
    @Test
    public void longestCommonPrefixWithSameElements() {
        String[] input = new String[]{"c", "c"};
        String expected = "c";
        String actual = new Solution().longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
}