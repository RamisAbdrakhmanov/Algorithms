package leetcode.binary_tree.midium;

import leetcode.TreeNode;

public class LowestCommonAncestorOfABinaryTree {

    TreeNode node = new TreeNode();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isTarget(root,p,q);

        return node;
    }

    public boolean isTarget(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        if (root == p || q == root) {
            return true;
        }
        boolean left = isTarget(root.left, p, q);
        boolean right = isTarget(root.right, p, q);

        if (left && right) {
            node = root;
        }
        return left || right;
    }
}
