package com.leetcode.problem104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepth(root, 1);
    }

    private int maxDepth(TreeNode n, int depth) {
        int maxDepthL = depth;
        int maxDepthR = depth;
        if (n.left != null) {
            maxDepthL = maxDepth(n.left, depth + 1);
        }
        if (n.right != null) {
            maxDepthR = maxDepth(n.right, depth + 1);
        }
        return Math.max(maxDepthL, maxDepthR);
    }
}
