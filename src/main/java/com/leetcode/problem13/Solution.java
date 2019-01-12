package com.leetcode.problem13;

public class Solution {
    private int val(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int value = val(s.charAt(i));
            if (i+1 < len) {
                int nextValue = val(s.charAt(i+1));
                if (value < nextValue) {
                    value = nextValue - value;
                    i++;
                }
            }
            sum += value;
        }
        return sum;
    }
}
