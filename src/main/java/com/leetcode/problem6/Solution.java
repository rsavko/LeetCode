package com.leetcode.problem6;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s == null || s.length() < 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        int step = 1;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            if (index + 1 == numRows) {
                step = -1;
            }
            if (index == 0) {
                step = 1;
            }
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(sb[i].toString());
        }
        return result.toString();
    }
}
