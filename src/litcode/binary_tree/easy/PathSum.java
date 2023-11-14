package litcode.binary_tree.easy;

import litcode.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int difference = targetSum - root.val;
        return hasPathSum(root.left, difference) || hasPathSum(root.right, difference);
    }
}
