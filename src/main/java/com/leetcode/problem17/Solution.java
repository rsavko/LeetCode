package com.leetcode.problem17;

import java.util.*;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class Solution {

    static Map<Character, List<String>> map = new HashMap<>();

    static {
        map.put('0', emptyList());
        map.put('1', emptyList());
        map.put('2', asList("a", "b", "c"));
        map.put('3', asList("d", "e", "f"));
        map.put('4', asList("g", "h", "i"));
        map.put('5', asList("j", "k", "l"));
        map.put('6', asList("m", "n", "o"));
        map.put('7', asList("p", "q", "r", "s"));
        map.put('8', asList("t", "u", "v"));
        map.put('9', asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.trim().isEmpty()) {
            return result;
        }
        if (digits.length() == 1) {
            return map.getOrDefault(digits.charAt(0), result);
        }

        if (isDigit(digits.charAt(0))) {
            result.addAll(map.getOrDefault(digits.charAt(0), result));
        } else {
            return emptyList();
        }
        for (int i = 1; i < digits.length(); i++) {
            List<String> vals = map.getOrDefault(digits.charAt(i), emptyList());
            int size = result.size();
            for (int j = 0; j < size; j++) {
                String combination = result.removeFirst();
                for (String val : vals) {
                    result.add(combination + val);
                }
            }
        }
        return result;
    }
}
