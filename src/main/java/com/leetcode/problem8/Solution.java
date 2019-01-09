package com.leetcode.problem8;

public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        long result = 0;
        boolean negative = false;
        boolean signChecked = false;
        boolean nonWhitespaceSequence = false;
        char whitespace = ' ';

        for (char c : str.toCharArray()) {
            if (c == whitespace) {
                if (nonWhitespaceSequence || signChecked) {
                    return (int) (negative ? -result : result);
                }
                continue;
            }

            if (c == '-' || c == '+') {
                if (signChecked) {
                    return (int) (negative ? -result : result);
                }
                negative = c == '-';
                signChecked = true;
                continue;
            }
            if (!Character.isDigit(c)) {
                return (int) (negative ? -result : result);
            }
            signChecked = true;
            result = result * 10 + Integer.parseInt(String.valueOf(c));
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (result > Integer.MAX_VALUE) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            nonWhitespaceSequence = true;
        }
        return (int) (negative ? -result : result);
    }
}
