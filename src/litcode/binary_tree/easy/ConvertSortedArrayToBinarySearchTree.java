package litcode.binary_tree.easy;

import litcode.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;


        return builder(nums,left,right);
    }

    public TreeNode builder(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = builder(nums, left, mid - 1);
        node.right = builder(nums, mid + 1, right);

        return node;
    }
}
