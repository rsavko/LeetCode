package com.leetcode.problem101;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Symmetric Tree")
class SolutionTest {
    @Test
    @DisplayName("Tree is symmetric")
    void isSymmetric() {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(2);
        input.left.left = new TreeNode(3);
        input.left.right = new TreeNode(4);

        input.right.left = new TreeNode(4);
        input.right.right = new TreeNode(3);

        boolean actual = new Solution().isSymmetric(input);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Tree is not symmetric")
    void isNotSymmetric() {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(2);
        input.left.right = new TreeNode(3);
        input.right.right = new TreeNode(3);

        boolean actual = new Solution().isSymmetric(input);
        assertFalse(actual);
    }
}