package com.leetcode.problem242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final char[] s1 = s.toCharArray();
        final char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return new String(s1).equals(new String(t1));
    }
}
