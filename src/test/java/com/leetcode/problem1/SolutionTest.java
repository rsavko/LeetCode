package com.leetcode.problem1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Two Sum")
class SolutionTest {

    @Test
    void targetExists() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void targetExists2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;
        int[] expected = new int[]{0, 3};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Throw exception if provided target not exists")
    void targetNotExists() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 8;

        assertThrows(IllegalArgumentException.class, () -> new Solution().twoSum(nums, target));

    }
}