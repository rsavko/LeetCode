package com.leetcode.problem283;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Move Zeroes")
class SolutionTest {
    @Test
    @DisplayName("Zeroes moved to the end")
    void moveZeroes() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        new Solution().moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Zeroes moved to the end with starting non-zero number")
    void moveZeroesStartingWithNonZero() {
        int[] input = new int[]{1, 1, 0, 3, 12};
        int[] expected = new int[]{1, 1, 3, 12, 0};
        new Solution().moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Without zeroes")
    void moveWithoutZeroes() {
        int[] input = new int[]{1, 3, 12};
        int[] expected = new int[]{1, 3, 12};
        new Solution().moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Empty array handled correctly")
    void emptyArray() {
        int[] input = new int[0];
        int[] expected = new int[0];
        new Solution().moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}