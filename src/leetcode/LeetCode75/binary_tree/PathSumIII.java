package leetcode.LeetCode75.binary_tree;

import leetcode.TreeNode;

public class PathSumIII {
    int count = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        pathSumHelper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    public void pathSumHelper(TreeNode root, int targetSum, int sumBefore) {
        if (root == null) {
            return;
        }
        if (root.val + sumBefore == targetSum) {
            count++;
        }

        pathSumHelper(root.left, targetSum, sumBefore + root.val);
        pathSumHelper(root.right, targetSum, sumBefore + root.val);
    }
}
