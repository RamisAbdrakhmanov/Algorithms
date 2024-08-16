package leetcode.interview.questions.medium;

import leetcode.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    int p = 0;
    int i = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builder(inorder, postorder, Integer.MAX_VALUE);
    }

    public TreeNode builder(int[] inorder, int[] postorder, int stop) {
        if (p >= postorder.length) {
            return null;
        }
        if (inorder[inorder.length - 1 - i] == stop) {
            i++;
            return null;
        }

        TreeNode node = new TreeNode(postorder[postorder.length-1-p++]);
        node.right = builder(inorder,postorder,node.val);
        node.left = builder(inorder,postorder,stop);
        return node;
    }
}
