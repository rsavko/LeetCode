package com.leetcode.problem28;

// https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null || needle.length() > haystack.length()) return -1;
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && needle.charAt(j) == haystack.charAt(i + j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public int strStrKMP(String haystack, String needle) {
        if (haystack == null || haystack.isEmpty() && needle == null || needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int[] lps = calculateLPS(needle);
        int i = 0; // index for haystack
        int j = 0; // index for needle
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i - j;
            } else if (i < haystack.length() && (haystack.charAt(i) != needle.charAt(j))) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }

        }
        return -1;
    }

    private int[] calculateLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }
}
