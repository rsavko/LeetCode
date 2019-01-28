package com.leetcode.problem15;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("3Sum")
class SolutionTest {

    @Test
    void threeSum() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 1));
        expected.add(Arrays.asList(-1, -1, 2));

        List<List<Integer>> actual = new Solution().threeSum(input);
        assertEquals(expected.size(), actual.size());
        //assertThat(actual, containsInAnyOrder(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2)));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    void threeSumUniqueInput() {
        int[] input = new int[]{-1, 0, 1, 1, -1, 0};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> actual = new Solution().threeSum(input);
        assertEquals(expected.size(), actual.size());
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    void threeSumSameInput() {
        int[] input = new int[]{0, 0, 0};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> actual = new Solution().threeSum(input);
        assertEquals(expected.size(), actual.size());
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
}