package leetcode.interview.questions.easy;

import leetcode.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
