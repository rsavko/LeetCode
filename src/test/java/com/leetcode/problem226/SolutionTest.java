package com.leetcode.problem226;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Invert Binary Tree")
class SolutionTest {
    @Test
    @DisplayName("Correctly inverts binary tree")
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode actual = new Solution().invertTree(root);
        assertArrayEquals(toArray(root), toArray(actual));
    }

    private int[] toArray(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            result.add(n.val);
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}