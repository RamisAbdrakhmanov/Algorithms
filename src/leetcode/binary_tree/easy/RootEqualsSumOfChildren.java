package leetcode.binary_tree.easy;

import leetcode.TreeNode;

public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return(root.left.val + root.right.val == root.val);
    }

}
