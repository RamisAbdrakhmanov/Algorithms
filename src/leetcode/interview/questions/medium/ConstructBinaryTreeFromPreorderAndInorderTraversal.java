package leetcode.interview.questions.medium;

import leetcode.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 8, 5, 9, 10, 3, 11, 13, 14, 12, 15, 16};
        int[] in =  {7, 4, 8, 2, 9, 5, 10, 1, 13, 11, 14, 3, 12, 15, 16};
      new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(pre,in);

    }
    int pre;
    int in;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (pre >= preorder.length) {
            return null;
        }

        if (inorder[in] == stop) {
            System.out.println(12);
            in++;
            return null;
        }

        TreeNode node = new TreeNode(pre++);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;
    }

  /*  static void show(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val+ " ");

        show(node.left);
        show(node.right);
    }*/


}
