package com.leetcode.problem17;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;

@DisplayName("Letter Combinations of a Phone Number")
class SolutionTest {

    @Test
    void emptyList() {
        String input = "";
        List<String> actual = new Solution().letterCombinations(input);
        assertThat(actual, is(empty()));
    }

    @Test
    void oneDigit() {
        String input = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> actual = new Solution().letterCombinations(input);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, IsIterableContainingInAnyOrder.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void letterCombinations() {
        String input = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = new Solution().letterCombinations(input);
        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, IsIterableContainingInAnyOrder.containsInAnyOrder(expected.toArray()));
    }
}