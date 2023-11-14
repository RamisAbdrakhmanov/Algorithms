package litcode.binary_tree.easy;

import litcode.TreeNode;

public class EvaluateBooleanBinaryTree {
    static boolean helper(TreeNode root) {
        if (root.val == 1) {
            return true;
        } else if (root.val == 0) {
            return false;
        } else if (root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else {
            return helper(root.left) && helper(root.right);
        }
    }

    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }
}
