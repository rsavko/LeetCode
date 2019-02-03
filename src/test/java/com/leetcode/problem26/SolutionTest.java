package com.leetcode.problem26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Remove Duplicates from Sorted Array")
class SolutionTest {

    @Test
    @DisplayName("Removes duplicates from sorted array")
    void removeDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        int result = new Solution().removeDuplicates(nums);
        assertEquals(2, result);
        int[] expected = new int[]{1, 2};
        int[] actual = Arrays.copyOfRange(nums, 0, result);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Removes duplicates from empty array")
    void removeDuplicatesFromEmptyArray() {
        int result = new Solution().removeDuplicates(new int[]{});
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Removes duplicates from array of 1 element")
    void removeDuplicatesFromArrayOf1Element() {
        int result = new Solution().removeDuplicates(new int[]{1});
        assertEquals(1, result);
    }
}