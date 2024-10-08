package leetcode.binary_tree.easy;

import leetcode.TreeNode;

public class FindACorrespondingNodeOfABinaryTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }

        if (original == target) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) {
            return getTargetCopy(original.left, cloned.left, target);
        } else {
            return getTargetCopy(original.right, cloned.right, target);
        }


    }
}
