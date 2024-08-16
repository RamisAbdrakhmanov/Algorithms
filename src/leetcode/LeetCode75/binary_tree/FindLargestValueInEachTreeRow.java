package leetcode.LeetCode75.binary_tree;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRow {
    List<Integer> maxInRow = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        max(root, 1);

        return maxInRow;
    }

    public void max(TreeNode node, int row) {
        if (node == null) return;

        if (row <= maxInRow.size()) {
            int prevMax = maxInRow.get(row - 1);
            maxInRow.set(row - 1, Math.max(prevMax, node.val));
        } else {
            maxInRow.add(node.val);
        }

        max(node.left, row + 1);
        max(node.right, row + 1);
    }

}
