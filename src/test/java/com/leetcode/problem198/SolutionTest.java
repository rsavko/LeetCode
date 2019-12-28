package com.leetcode.problem198;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("House Robber")
class SolutionTest {
    @Test
    @DisplayName("Max amount to rob")
    void robEvenNumberOfHouses() {
        int[] input = new int[]{1, 2, 3, 1};
        int expected = 4;
        int actual = new Solution().rob(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Max amount to rob")
    void robOddNumberOfHouses() {
        int[] input = new int[]{2, 7, 9, 3, 1};
        int expected = 12;
        int actual = new Solution().rob(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Handles empty input")
    void emptyList() {
        int[] input = new int[]{};
        int expected = 0;
        int actual = new Solution().rob(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Handles 1-element input")
    void oneElementList() {
        int[] input = new int[]{2};
        int expected = 2;
        int actual = new Solution().rob(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Max rob amount")
    void robMax() {
        int[] input = new int[]{2,1,1,2};
        int expected = 4;
        int actual = new Solution().rob(input);
        assertEquals(expected, actual);
    }
}