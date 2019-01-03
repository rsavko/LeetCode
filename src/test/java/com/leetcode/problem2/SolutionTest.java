package com.leetcode.problem2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        final ListNode result = new Solution().addTwoNumbers(l1, l2);
        assertNotNull(result);
        assertEquals(7, result.val);

        assertNotNull(result.next);
        assertEquals(0, result.next.val);

        assertNotNull(result.next.next);
        assertEquals(8, result.next.next.val);
    }
}