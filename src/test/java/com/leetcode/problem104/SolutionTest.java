package com.leetcode.problem104;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("Max Depth of Binary tree with depth 3")
    void maxDepth3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 3;

        int actual = new Solution().maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Max Depth of Binary tree with depth 1")
    void maxDepth1() {
        TreeNode root = new TreeNode(3);
        int expected = 1;

        int actual = new Solution().maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Max Depth of empty tree")
    void maxDepthEmptyTree() {
        int expected = 0;

        int actual = new Solution().maxDepth(null);
        assertEquals(expected, actual);
    }
}