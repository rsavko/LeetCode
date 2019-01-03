package com.leetcode.problem1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class SolutionTest {

    @Test
    public void targetExists() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals("Expected result is different", expected, actual);
    }

    @Test
    public void targetExists2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;
        int[] expected = new int[]{0, 3};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals("Expected result is different", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void targetNotExists() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 8;

        Solution solution = new Solution();
        solution.twoSum(nums, target);

        fail("Should throw exception");
    }
}