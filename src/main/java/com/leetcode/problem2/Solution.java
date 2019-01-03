package com.leetcode.problem2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2;
        ListNode curNode = dummy;
        int carry = 0;

        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;

            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curNode.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
