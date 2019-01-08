package com.leetcode.problem6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void with3Rows() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String actual = new Solution().convert(input, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void with4Rows() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String actual = new Solution().convert(input, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void with1Rows() {
        String input = "AB";
        int numRows = 1;
        String expected = "AB";
        String actual = new Solution().convert(input, numRows);
        assertEquals(expected, actual);
    }
}