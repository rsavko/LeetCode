package com.leetcode.problem12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman_3() {
        int input = 3;
        String expected = "III";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_4() {
        int input = 4;
        String expected = "IV";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_9() {
        int input = 9;
        String expected = "IX";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_11() {
        int input = 11;
        String expected = "XI";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_40() {
        int input = 40;
        String expected = "XL";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_400() {
        int input = 400;
        String expected = "CD";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_900() {
        int input = 900;
        String expected = "CM";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_90() {
        int input = 90;
        String expected = "XC";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_58() {
        int input = 58;
        String expected = "LVIII";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_1994() {
        int input = 1994;
        String expected = "MCMXCIV";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_3999() {
        int input = 3999;
        String expected = "MMMCMXCIX";
        String actual = new Solution().intToRoman(input);
        assertEquals(expected, actual);
    }
}