package com.leetcode.problem155;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    private MinStack stack;

    @BeforeEach
    public void setup() {
        stack = new MinStack();
    }

    @Test
    @DisplayName("push method works")
    void push() {
        stack.push(123);
        assertEquals(123, stack.top());
    }

    @Test
    @DisplayName("pop method works")
    void pop() {
        stack.push(1);
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(2, stack.top());
        stack.pop();
        assertEquals(1, stack.top());
    }

    @Test
    @DisplayName("top method works")
    void top() {
        stack.push(1);
        assertEquals(1, stack.top());
        stack.push(3);
        assertEquals(3, stack.top());
    }

    @Test
    @DisplayName("getMin method works")
    void getMin() {
        stack.push(-2);
        assertEquals(-2, stack.getMin());
        stack.push(0);
        assertEquals(-2, stack.getMin());
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(-2, stack.getMin());
    }
}