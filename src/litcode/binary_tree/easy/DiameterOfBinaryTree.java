package litcode.binary_tree.easy;

import litcode.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] t = new int[1];
        maxLength(root, t);
        return t[0];
    }

    public int maxLength(TreeNode node, int t[]) {
        if (node == null) {
            return 0;
        }
        int left = maxLength(node.left, t);
        int right = maxLength(node.right, t);

        t[0] = Math.max(t[0], left + right);
        return Math.max(left, right) + 1;
    }
}
