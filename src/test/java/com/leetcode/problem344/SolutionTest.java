package com.leetcode.problem344;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Correctly reverses input array")
    void reverse() {
        char[] input = new char[] {'h','e','l','l','o'};
        char[] expected = new char[] {'o','l','l','e','h'};
        new Solution().reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Correctly handles empty array")
    void reverseEmptyArray() {
        char[] input = new char[0];
        char[] expected = new char[0];
        new Solution().reverseString(input);
        assertArrayEquals(expected, input);
    }
    @Test
    @DisplayName("Correctly handles 1-element array")
    void reverseOneElementArray() {
        char[] input = new char[] {'a'};
        char[] expected = new char[] {'a'};;
        new Solution().reverseString(input);
        assertArrayEquals(expected, input);
    }
}