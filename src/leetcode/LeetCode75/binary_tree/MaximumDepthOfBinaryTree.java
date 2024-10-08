package leetcode.LeetCode75.binary_tree;

import leetcode.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
    if(root == null){
        return 0;
    }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;

    }
}
