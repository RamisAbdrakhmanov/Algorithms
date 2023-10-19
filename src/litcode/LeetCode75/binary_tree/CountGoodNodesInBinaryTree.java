package litcode.LeetCode75.binary_tree;

import litcode.TreeNode;

public class CountGoodNodesInBinaryTree {
    int count = 0;

    public int goodNodes(TreeNode root) {
        more(root, root.val);
        return count;
    }

    public void more(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        more(root.left, max);
        more(root.right, max);
    }
}
