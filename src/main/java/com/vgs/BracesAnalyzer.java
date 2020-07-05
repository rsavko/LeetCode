package com.vgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracesAnalyzer {
    private static final Map<Character, Character> braces = new HashMap<>();

    static {
        braces.put('(', ')');
        braces.put('[', ']');
        braces.put('{', '}');
    }

    public boolean isValid(String data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data.toCharArray()) {
            if (braces.containsKey(c)) {
                stack.push(c);
            } else {
                if (braces.containsValue(c)) {
                    if (stack.empty() || braces.get(stack.pop()) != c) return false;
                }
            }
        }
        return stack.empty();
    }
}