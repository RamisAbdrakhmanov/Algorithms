package litcode.BinaryTree.easy;


import litcode.TreeNode;

public class SunOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return sumOfLeftLeaves(root.right);
        }

        return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

}
