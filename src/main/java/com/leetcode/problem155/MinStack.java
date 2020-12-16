package com.leetcode.problem155;

public class MinStack {
    private Node top;

    public MinStack() {
    }

    public void push(int x) {
        if (top == null) {
            top = new Node(x);
        } else {
            Node temp = new Node(x);
            temp.next = top;
            temp.min = Math.min(x, top.min);
            top = temp;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public int top() {
        if (top == null) {
            return Integer.MAX_VALUE;
        }
        return top.val;
    }

    public int getMin() {
        if (top == null) {
            return Integer.MAX_VALUE;
        }
        return top.min;
    }
}
