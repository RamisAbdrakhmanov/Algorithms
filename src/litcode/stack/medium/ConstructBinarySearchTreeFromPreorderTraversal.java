package litcode.stack.medium;

import litcode.TreeNode;

import java.util.Stack;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(new TreeNode(preorder[0]));
        TreeNode head = stack.peek();
        TreeNode prev = stack.peek();
        for (int i = 1; i < preorder.length; i++) {
            if (preorder[i] < prev.val) {
                stack.push(prev);
                prev.left = new TreeNode(preorder[i]);
                prev = prev.left;
            } else {
                while (!stack.isEmpty() && preorder[i] > stack.peek().val){
                    prev = stack.pop();
                }
                prev.right = new TreeNode(preorder[i]);
                stack.push(prev.right);
                prev = prev.right;
            }
        }

        return head;
    }
}
