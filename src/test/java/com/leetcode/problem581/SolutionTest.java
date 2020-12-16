package com.leetcode.problem581;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shortest Unsorted Continuous Subarray")
class SolutionTest {

    @Test
    @DisplayName("Finds Unsorted Subarray")
    void findUnsortedSubarray() {
        int[] input = new int[]{2, 6, 4, 8, 10, 9, 15};
        int expected = 5;
        int actual = new Solution().findUnsortedSubarray(input);
        assertEquals(expected, actual);
    }
}