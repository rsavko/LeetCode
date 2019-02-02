package com.leetcode.problem24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Swap Nodes in Pairs")
class SolutionTest {

    @Test
    @DisplayName("Should correctly swap nodes")
    void swapPairs() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        List<Integer> expected = Arrays.asList(2, 1, 4, 3, 6, 5);
        ListNode actual = new Solution().swapPairs(list);
        assertThat(toList(actual), is(expected));
    }

    @Test
    @DisplayName("Test swap nodes with 1 element")
    void swapPairsOneElement() {
        ListNode list = new ListNode(1);

        List<Integer> expected = Arrays.asList(1);
        ListNode actual = new Solution().swapPairs(list);
        assertThat(toList(actual), is(expected));
    }

    private List<Integer> toList(ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
}