package litcode.LeetCode75.binary_tree;

import litcode.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            System.gc();
            return null;
        }
        if(root.val==val){
            System.gc();
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
