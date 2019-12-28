package com.leetcode.problem617;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Merge Two Binary Trees")
class SolutionTest {

    @Test
    @DisplayName("Merges Two Binary Trees")
    void mergeTrees() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode merged = new TreeNode(3);
        merged.left = new TreeNode(4);
        merged.right = new TreeNode(5);
        merged.left.left = new TreeNode(5);
        merged.left.right = new TreeNode(4);
        merged.right.right = new TreeNode(7);

        TreeNode actualMerged = new Solution().mergeTrees(t1, t2);
        final int[] expected = toArray(merged);
        final int[] actual = toArray(actualMerged);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Merges Two Binary Trees when one is null")
    void oneTreeIsNull() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode actualMerged = new Solution().mergeTrees(t1, null);
        assertArrayEquals(toArray(t1), toArray(actualMerged));
    }

    private int[] toArray(TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(t);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return result.stream().mapToInt(v -> v).toArray();
    }
}