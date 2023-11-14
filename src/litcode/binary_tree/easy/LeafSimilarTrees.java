package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        addLeave(root1, list1);
        addLeave(root2, list2);
        return list1.equals(list2);
    }

    public void addLeave(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }
        addLeave(node.right, list);
        addLeave(node.left, list);
    }
}
