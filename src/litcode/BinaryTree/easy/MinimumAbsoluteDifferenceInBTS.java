package litcode.BinaryTree.easy;

import litcode.TreeNode;

public class MinimumAbsoluteDifferenceInBTS {

        public int getMinimumDifference(TreeNode root) {
            if (root == null) {
                return Integer.MAX_VALUE;
            }
            int l = Integer.MAX_VALUE;
            int r = Integer.MAX_VALUE;
            if (root.left != null) {
                l = Math.abs(root.val - root.left.val);
            }

            if (root.right != null) {
                r = Math.abs(root.val - root.right.val);
            }

            int nextMin = Math.min(getMinimumDifference(root.left),getMinimumDifference(root.right));
            return Math.min(Math.min(l, r),nextMin);
        }


}
