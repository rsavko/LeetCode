package com.leetcode.problem14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String s = strs[0];
        if (s == null || s.isEmpty()) {
            return "";
        }
        int endIndex = s.length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i] == null || strs[i].isEmpty()) {
                return "";
            }
            endIndex = Math.min(endIndex, strs[i].length());

            for (int index = 0; index < endIndex; index++) {
                if (s.charAt(index) != strs[i].charAt(index)) {
                    endIndex = index;
                    break;
                }
            }
        }
        return s.substring(0, endIndex);
    }
}
