package litcode.binary_tree.midium;

import litcode.TreeNode;

public class CountNodesEqualToAverageOfSubtree {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        sumTree(root);
        return count;
    }

    public int[] sumTree(TreeNode node) {
        if (node == null) {
            return new int[]{0,0};
        }
        int[] left = sumTree(node.left);
        int[] right = sumTree(node.right);

        int[] cur = {node.val + left[0] + right[0], left[1] + right[1] + 1};

        if (node.val == 0 && cur[0] == 0) {
            count++;
        }
        if (node.val != 0 && cur[0] / cur[1] == node.val) {
            count++;
        }

        return cur;
    }


}
