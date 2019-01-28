package com.leetcode.problem19;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Remove Nth Node From End of List")
class SolutionTest {

    @Test
    void removeNthFromEnd() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);

        ListNode actual = new Solution().removeNthFromEnd(input, 2);

        List<Integer> expectedResult = new ArrayList<>();
        while (input != null) {
            expectedResult.add(input.val);
            input = input.next;
        }

        List<Integer> actualResult = new ArrayList<>();
        while (actual != null) {
            actualResult.add(actual.val);
            actual = actual.next;
        }

        assertThat(actualResult, hasSize(4));
        assertThat(actualResult, equalTo(expectedResult));
    }

    @Test
    void remove1stFromEnd() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);

        ListNode actual = new Solution().removeNthFromEnd(input, 1);

        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> actualResult = new ArrayList<>();
        while (actual != null) {
            actualResult.add(actual.val);
            actual = actual.next;
        }

        assertThat(actualResult, hasSize(expectedResult.size()));
        assertThat(actualResult, equalTo(expectedResult));
    }

    @Test
    void remove5thFromEnd() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);

        ListNode actual = new Solution().removeNthFromEnd(input, 5);

        List<Integer> expectedResult = Arrays.asList(1, 3, 4, 5, 6);

        List<Integer> actualResult = new ArrayList<>();
        while (actual != null) {
            actualResult.add(actual.val);
            actual = actual.next;
        }

        assertThat(actualResult, hasSize(expectedResult.size()));
        assertThat(actualResult, equalTo(expectedResult));
    }

    @Test
    void remove1thFromEnd_listOf1Element() {
        ListNode input = new ListNode(1);

        ListNode actual = new Solution().removeNthFromEnd(input, 1);

        List<Integer> actualResult = new ArrayList<>();
        while (actual != null) {
            actualResult.add(actual.val);
            actual = actual.next;
        }

        assertThat(actual, is(nullValue()));
    }

    @Test
    @Disabled
    void remove2thFromEnd_listOf2Elements() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);

        ListNode actual = new Solution().removeNthFromEnd(input, 1);
        List<Integer> expectedResult = Arrays.asList(2);

        List<Integer> actualResult = new ArrayList<>();
        while (actual != null) {
            actualResult.add(actual.val);
            actual = actual.next;
        }

        assertThat(actualResult, hasSize(expectedResult.size()));
        assertThat(actualResult, equalTo(expectedResult));
    }
}