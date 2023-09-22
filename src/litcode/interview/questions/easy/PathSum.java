package litcode.interview.questions.easy;

import litcode.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int nextTargetSum = targetSum - root.val;
        return hasPathSum(root.left, nextTargetSum) || hasPathSum(root.right, nextTargetSum);
    }


}
