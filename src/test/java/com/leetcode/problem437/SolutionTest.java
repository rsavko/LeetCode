package com.leetcode.problem437;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Path Sum III")
class SolutionTest {
    @Test
    @DisplayName("Path Sum is 3")
    void pathSum() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        int expected = 3;
        int actual = new Solution().pathSum(root, 8);
        assertEquals(expected, actual);
    }
}