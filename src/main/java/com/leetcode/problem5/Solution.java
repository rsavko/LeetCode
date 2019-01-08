package com.leetcode.problem5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 1; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (end - start < right - left) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            int left = i - 1;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (end - start < right - left) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        return s.substring(start, end + 1);
    }
}
