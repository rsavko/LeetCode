package com.leetcode.problem543;

public class Solution {
    int answer;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return answer;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        answer = Math.max(left + right, answer);
        return Math.max(left, right) + 1;
    }
}
