package com.leetcode.problem17;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void emptyList() {
        String input = "";
        List<String> actual = new Solution().letterCombinations(input);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void emptyListFor1() {
        String input = "1";
        List<String> actual = new Solution().letterCombinations(input);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void oneDigit() {
        String input = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> actual = new Solution().letterCombinations(input);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual.toArray(), arrayContainingInAnyOrder(expected.toArray()));
    }

    @Test
    public void letterCombinations() {
        String input = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = new Solution().letterCombinations(input);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual.toArray(), arrayContainingInAnyOrder(expected.toArray()));
    }
}