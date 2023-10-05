package litcode.BinaryTree.easy;

import litcode.TreeNode;

public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return(root.left.val + root.right.val == root.val);
    }

}
