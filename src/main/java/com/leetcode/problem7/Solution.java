package com.leetcode.problem7;

public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        long result = 0;
        int reminder;
        while (x > 0) {
            reminder = x % 10;
            result = result * 10 + reminder;
            x /=10;
        }
        if (result >= Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -result : result);
    }
}
