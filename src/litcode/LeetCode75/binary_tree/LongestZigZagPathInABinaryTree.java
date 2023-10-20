package litcode.LeetCode75.binary_tree;

import litcode.TreeNode;

public class LongestZigZagPathInABinaryTree {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        lzz(root, 0, 0);
        lzz(root, 1, 0);
        return max;
    }

    public void lzz(TreeNode node, int mark, int sum) {
        if (node == null) {
            return;
        }

        max = Math.max(sum, max);
        if (mark == 0) {
            lzz(node.left, 0, 1);
            lzz(node.right, 1, sum + 1);

        } else {
            lzz(node.right, 1, 1);
            lzz(node.left, 0, sum + 1);
        }
    }
}
