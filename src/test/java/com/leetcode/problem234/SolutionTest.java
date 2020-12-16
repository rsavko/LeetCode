package com.leetcode.problem234;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Palindrome Linked List")
class SolutionTest {
    @Test
    @DisplayName("List Node is not palindrome")
    public void isNotPalindrome() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        boolean actual = new Solution().isPalindrome(node);
        assertFalse(actual);
    }

    @Test
    @DisplayName("List Node is palindrome")
    public void isPalindrome() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);
        boolean actual = new Solution().isPalindrome(node);
        assertTrue(actual);
    }
}