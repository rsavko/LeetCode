package com.leetcode.problem24;

public class Solution {
    /*See https://www.youtube.com/watch?time_continue=706&v=jiLloHVmLDc for more details */
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode p = head;
        ListNode newStart = p.next;
        ListNode q;
        while (true) {
            q = p.next;
            ListNode temp = q.next;
            q.next = p;
            if (temp == null || temp.next == null) {
                p.next = temp;
                break;
            }
            p.next = temp.next;
            p = temp;
        }
        return newStart;
    }
}
