package com.leetcode.problem3;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

// Explanation: https://www.youtube.com/watch?v=sZosU8JjVaA

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>(); // char to index
        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            if (seen.containsKey(s.charAt(endIndex))) {
                startIndex = max(startIndex, seen.get(s.charAt(endIndex)) + 1);
            }
            seen.put(s.charAt(endIndex), endIndex);
            maxLength = max(maxLength, endIndex - startIndex + 1);
        }
        return maxLength;
    }
}
