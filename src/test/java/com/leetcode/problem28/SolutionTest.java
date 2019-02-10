package com.leetcode.problem28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Implement strStr()")
class SolutionTest {

    @Test
    @DisplayName("Should return index if substring exists")
    void strStr() {
        String haystack = "hello", needle = "ll";
        int expected = 2;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test substring not exists")
    void strStr2() {
        String haystack = "hello", needle = "lla";
        int expected = -1;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Needle longer than haystack")
    void needleLonger() {
        String haystack = "he", needle = "hello";
        int expected = -1;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test empty needle")
    void emptyNeedle() {
        String haystack = "hello", needle = "";
        int expected = 0;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test substring not exists")
    void substringNotExists() {
        String haystack = "aaaaa", needle = "bba";
        int expected = -1;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test empty haystack")
    void haystackIsEmpty() {
        String haystack = "", needle = "bba";
        int expected = -1;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test")
    void complex() {
        String haystack = "abbaba", needle = "ba";
        int expected = 2;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("All inputs are empty")
    void allInputsEmpty() {
        String haystack = "", needle = "";
        int expected = 0;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("All inputs are empty")
    void haystackIsEmptyNeedleNot() {
        String haystack = "", needle = "a";
        int expected = -1;
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(expected, actual);
    }
}