package leetcode.binary_tree.midium;

import leetcode.TreeNode;

public class MaximumBinaryTree {
    public static void main(String[] args) {
        new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructor(0, nums.length - 1, nums);
    }

    public TreeNode constructor(int l, int r, int[] nums) {
        if (l > r) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = l; i <= r; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode head = new TreeNode(max);
        head.left = constructor(l, index - 1, nums);
        head.right = constructor(index + 1, r, nums);
        return head;
    }

}
