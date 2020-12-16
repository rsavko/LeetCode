package com.leetcode.problem141;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Linked List Cycle")
class SolutionTest {
    @Test
    @DisplayName("List with 4 nodes has cycle")
    void hasCycle() {
        ListNode node = new ListNode(3);
        ListNode cycleNode = new ListNode(2);
        node.next = cycleNode;
        cycleNode.next = new ListNode(0);
        cycleNode.next.next = new ListNode(-4);
        cycleNode.next.next.next = cycleNode;

        boolean hasCycle = new Solution().hasCycle(node);
        assertTrue(hasCycle);
    }

    @Test
    @DisplayName("List with 2 nodes has cycle")
    void hasCycle2() {
        ListNode node = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        node.next = nextNode;
        nextNode.next = node;

        boolean hasCycle = new Solution().hasCycle(node);
        assertTrue(hasCycle);
    }

    @Test
    @DisplayName("1-element list node has no cycle")
    void hasNoCycle() {
        ListNode node = new ListNode(1);
        boolean hasCycle = new Solution().hasCycle(node);
        assertFalse(hasCycle);
    }

    @Test
    @DisplayName("2-element list node has no cycle")
    void hasNoCycle2() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        boolean hasCycle = new Solution().hasCycle(node);
        assertFalse(hasCycle);
    }
}