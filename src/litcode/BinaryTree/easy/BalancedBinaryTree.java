/*
package litcode.BinaryTree.easy;

import litcode.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return count(root) != -1;
    }

    public int count(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = count(node.left);
        if (left == -1) {
            return -1;
        }
        int right = count(node.right);

        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
*/
