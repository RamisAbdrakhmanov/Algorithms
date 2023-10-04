package litcode.BinaryTree.easy;

import litcode.TreeNode;

public class BinaryTreeTilt {

    public int findTilt(TreeNode root) {
        int[] tilt = new int[1];
        step(root, tilt);
        return tilt[0];
    }

    public int step(TreeNode node, int[] tilt) {
        if (node == null) {
            return 0;
        }
        int left = step(node.left, tilt);
        int right = step(node.right, tilt);

        tilt[0] += Math.abs(left - right);
        return left + node.val + right ;
    }

}
