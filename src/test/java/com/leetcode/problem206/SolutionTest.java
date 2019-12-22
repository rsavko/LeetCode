package com.leetcode.problem206;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Reverse Linked List")
class SolutionTest {
    @Test
    @DisplayName("Correctly reverses list")
    void reverse() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(5);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(1);

        ListNode actual = new Solution().reverseList(node);
        assertArrayEquals(toArray(expected), toArray(actual));
    }

    private int[] toArray(ListNode node) {
        List<Integer> result = new ArrayList<>();
        ListNode n = node;
        while (n != null) {
            result.add(n.val);
            n = n.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}