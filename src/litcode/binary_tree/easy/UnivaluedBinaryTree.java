package litcode.binary_tree.easy;

import litcode.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root.left == null && root.right ==null){
            return true;
        }
        if(root.left == null){
            return root.val == root.right.val && isUnivalTree(root.right);
        }

        if(root.right == null){
            return root.val == root.left.val && isUnivalTree(root.left);
        }
        if(root.val != root.left.val){
            return false;
        }

        if(root.val != root.right.val){
            return false;
        }

        return  isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
