package com.leetcode.problem22;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SolutionTest {

    @Test
    public void generateParenthesis() {
        int input = 3;
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = new Solution().generateParenthesis(input);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
}