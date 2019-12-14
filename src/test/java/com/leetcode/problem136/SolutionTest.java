package com.leetcode.problem136;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("Single number exists")
    void test1() {
        int[] input = new int[]{2, 2, 1};
        int expected = 1;
        int actual = new Solution().singleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Single number for longer array")
    void test2() {
        int[] input = new int[]{4, 1, 2, 1, 2};
        int expected = 4;
        int actual = new Solution().singleNumber(input);
        assertEquals(expected, actual);
    }

}