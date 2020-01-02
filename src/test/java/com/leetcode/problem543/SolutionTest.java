package com.leetcode.problem543;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Diameter of Binary Tree")
class SolutionTest {
    @Test
    @DisplayName("Diameter of Binary Tree")
    void diameterOfBinaryTree() {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(3);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        int expected = 3;
        int actual = new Solution().diameterOfBinaryTree(node);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Diameter of Perfect Binary Tree")
    void diameterOfPerfectBinaryTree() {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(3);
        node.left = new TreeNode(2);

        int expected = 2;
        int actual = new Solution().diameterOfBinaryTree(node);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Diameter of 1-node Binary Tree")
    void diameterOfOneNodeBinaryTree() {
        TreeNode node = new TreeNode(1);
        int expected = 0;
        int actual = new Solution().diameterOfBinaryTree(node);
        assertEquals(expected, actual);
    }

}