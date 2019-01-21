package com.leetcode.problem18;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void fourSum() {
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));

        List<List<Integer>> actual = new Solution().fourSum(input, target);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void fourSum2() {
        int[] input = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-3, -2, 2, 3));
        expected.add(Arrays.asList(-3, -1, 1, 3));
        expected.add(Arrays.asList(-3, 0, 0, 3));
        expected.add(Arrays.asList(-3, 0, 1, 2));
        expected.add(Arrays.asList(-2, -1, 0, 3));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));

        List<List<Integer>> actual = new Solution().fourSum(input, target);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void fourSum3() {
        int[] input = new int[]{-1,0,-5,-2,-2,-4,0,1,-2};
        int target = -9;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-5,-4,-1,1));
        expected.add(Arrays.asList(-5,-4,0,0));
        expected.add(Arrays.asList(-5,-2,-2,0));
        expected.add(Arrays.asList(-4,-2,-2,-1));

        List<List<Integer>> actual = new Solution().fourSum(input, target);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void sameElements() {
        int[] input = new int[]{0, 0, 0, 0};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0, 0));

        List<List<Integer>> actual = new Solution().fourSum(input, target);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void emptyList() {
        int[] input = new int[]{};
        int target = 10;
        List<List<Integer>> actual = new Solution().fourSum(input, target);
        assertThat(actual, is(empty()));
    }
}