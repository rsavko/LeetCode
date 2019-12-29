package com.leetcode.problem160;

public class Solution {
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int headALength = 0;
        ListNode hA = headA;
        while (hA != null) {
            headALength++;
            hA = hA.next;
        }

        int headBLength = 0;
        ListNode hB = headB;
        while (hB != null) {
            headBLength++;
            hB = hB.next;
        }
        if (hA != hB) return null;

        int diff = Math.abs(headALength - headBLength);
        ListNode shorter = headALength < headBLength ? headA : headB;
        ListNode longer = headALength < headBLength ? headB : headA;
        while (diff > 0) {
            longer = longer.next;
            diff--;
        }
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
