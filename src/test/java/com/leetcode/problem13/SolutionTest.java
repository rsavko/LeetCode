package com.leetcode.problem13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt_3() {
        String input = "III";
        int expected = 3;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_4() {
        String input = "IV";
        int expected = 4;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_9() {
        String input = "IX";
        int expected = 9;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_11() {
        String input = "XI";
        int expected = 11;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_58() {
        String input = "LVIII";
        int expected = 58;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_40() {
        String input = "XL";
        int expected = 40;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_400() {
        String input = "CD";
        int expected = 400;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_900() {
        String input = "CM";
        int expected = 900;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_1994() {
        String input = "MCMXCIV";
        int expected = 1994;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void romanToInt_3999() {
        String input = "MMMCMXCIX";
        int expected = 3999;
        int actual = new Solution().romanToInt(input);
        assertEquals(expected, actual);
    }
}