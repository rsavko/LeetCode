package com.leetcode.problem46;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Permutations")
class SolutionTest {

    @Test
    void permute_noElements() {
        int[] nums = new int[0];
        List<List<Integer>> expected = List.of(List.of());
        List<List<Integer>> actual = new Solution().permute(nums);
        assertIterableEquals(expected, actual);
    }

    @Test
    void permute_1element() {
        int[] nums = new int[]{1};
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> actual = new Solution().permute(nums);
        assertIterableEquals(expected, actual);
    }

    @Test
    void permute_2elements() {
        int[] nums = new int[]{0, 1};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        List<List<Integer>> actual = new Solution().permute(nums);
//        assertIterableEquals(expected, actual);
        assertThat(actual, containsInAnyOrder(expected.toArray()));

    }

    @Test
    void permute_3elements() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = List
              .of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2),
                    List.of(3, 2, 1));
        List<List<Integer>> actual = new Solution().permute(nums);
        assertIterableEquals(expected, actual);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
}
