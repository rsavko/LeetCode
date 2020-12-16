package com.leetcode.problem344;

public class Solution {
    public void reverseString(char[] s) {
        if (s.length > 1) {
            int middle = s.length / 2;
            for (int i = 0; i < middle; i++) {
                char temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
        }
    }
}
