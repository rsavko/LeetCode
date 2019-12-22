package com.leetcode.problem169;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Majority Element")
class SolutionTest {
    @Test
    @DisplayName("Majority Element found")
    void majorityElement() {
        int[] input = new int[]{3, 2, 3};
        int expected = 3;
        int actual = new Solution().majorityElement(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Majority Element for bigger array found")
    void majorityElement2() {
        int[] input = new int[]{2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int actual = new Solution().majorityElement(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Majority Element for bigger array found")
    void majorityElement3() {
        int[] input = new int[]{-1, 1, 1, 1, 2, 1};
        int expected = 1;
        int actual = new Solution().majorityElement(input);
        assertEquals(expected, actual);
    }
}