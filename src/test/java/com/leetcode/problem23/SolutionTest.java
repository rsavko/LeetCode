package com.leetcode.problem23;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Merge k Sorted Lists")
class SolutionTest {

    @Test
    @DisplayName("Merge Lists")
    void mergeKLists() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(4);
        first.next.next = new ListNode(5);

        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next = new ListNode(4);

        ListNode third = new ListNode(2);
        third.next = new ListNode(6);

        ListNode[] input = new ListNode[]{first, second, third};

        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6);

        ListNode actual = new Solution().mergeKLists(input);
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