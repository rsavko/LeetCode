package com.leetcode.problem242;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Valid Anagram")
class SolutionTest {

    @Test
    @DisplayName("Is Valid Anagram")
    void testValid() {
        String input1 = "anagram";
        String input2 = "nagaram";
        final boolean actual = new Solution().isAnagram(input1, input2);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Is Not Valid Anagram")
    void testNotValid() {
        String input1 = "rat";
        String input2 = "car";
        final boolean actual = new Solution().isAnagram(input1, input2);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Empty strings")
    void testEmptyStrings() {
        String input1 = "";
        String input2 = "";
        final boolean actual = new Solution().isAnagram(input1, input2);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Various length inputs")
    void testVariousLengthStrings() {
        String input1 = "abc";
        String input2 = "ac";
        final boolean actual = new Solution().isAnagram(input1, input2);
        assertFalse(actual);
    }

}