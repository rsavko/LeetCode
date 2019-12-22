package com.leetcode.problem448;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find All Numbers Disappeared in an Array")
class SolutionTest {
    @Test
    @DisplayName("Find numbers")
    void findDisappearedNumbers() {
        int[] input = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(5, 6);
        List<Integer> actual = new Solution().findDisappearedNumbers(input);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}