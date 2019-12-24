package com.leetcode.problem121;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Best Time to Buy and Sell Stock")
class SolutionTest {
    @Test
    @DisplayName("Finds max profit")
    void maxProfit() {
        int[] input = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = new Solution().maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finds max profit in increasing array")
    void maxProfitEdgeCase() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int expected = 4;
        int actual = new Solution().maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finds max profit in decreasing array")
    void maxProfitEdgeCase2() {
        int[] input = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        int actual = new Solution().maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finds max profit in 1-element array")
    void maxProfitSingleArray() {
        int[] input = new int[]{1};
        int expected = 0;
        int actual = new Solution().maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Finds max profit in empty array")
    void maxProfitEmptyArray() {
        int[] input = new int[0];
        int expected = 0;
        int actual = new Solution().maxProfit(input);
        assertEquals(expected, actual);
    }
}