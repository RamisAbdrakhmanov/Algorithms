package leetcode.LeetCode75.binary_tree;

import leetcode.TreeNode;

public class DeleteNodeInABTS {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }else {

            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }


            TreeNode minNode = root.right;
            while(minNode.left != null){
                minNode = minNode.left;
            }
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }



}
