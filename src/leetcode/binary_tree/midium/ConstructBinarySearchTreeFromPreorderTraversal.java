package leetcode.binary_tree.midium;

import leetcode.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructor(0,preorder.length-1,preorder);
    }

    public TreeNode constructor(int l, int r, int[] arr) {
        if (l > r) {
            return null;
        }
        TreeNode head = new TreeNode(arr[l]);
        int m = ++l;
        for (; m <= r; m++) {
            if (head.val < arr[m]) {
                break;
            }
        }
        head.left = constructor(l, m - 1, arr);
        head.right = constructor(m, r, arr);

        return head;
    }


}
