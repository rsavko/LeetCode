package com.leetcode.problem160;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Intersection of Two Linked Lists")
class SolutionTest {

    @Test
    @DisplayName("Intersection Node exists")
    void getIntersectionNode() {
        ListNode intersectNode = new ListNode(2);
        intersectNode.next = new ListNode(4);

        ListNode headA = new ListNode(0);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next = intersectNode;

        ListNode headB = new ListNode(3);
        headB.next = intersectNode;

        ListNode actual = new Solution().getIntersectionNode(headA, headB);
        assertNotNull(actual);
        assertArrayEquals(toArray(intersectNode), toArray(actual));
    }

    @Test
    @DisplayName("Return null for non-intersected nodes")
    void nonIntersectionNodes() {
        ListNode headA = new ListNode(2);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(4);

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(5);

        ListNode actual = new Solution().getIntersectionNode(headA, headB);
        assertNull(actual);
    }

    private int[] toArray(ListNode node) {
        List<Integer> collect = new ArrayList<>();
        ListNode n = node;
        while (n != null) {
            collect.add(n.val);
            n = n.next;
        }
        return collect.stream().mapToInt(t -> t).toArray();
    }
}