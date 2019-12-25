package com.leetcode.problem70;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Climbing Stairs")
class SolutionTest {
    @Test
    @DisplayName("Climb stairs for 6")
    void climbStairs() {
        int expected = 13;
        int actual = new Solution().climbStairs(6);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Climb stairs for 2")
    void climbStairsFor2() {
        int expected = 2;
        int actual = new Solution().climbStairs(2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Climb stairs for 3")
    void climbStairsFor3() {
        int expected = 3;
        int actual = new Solution().climbStairs(3);
        assertEquals(expected, actual);
    }
}