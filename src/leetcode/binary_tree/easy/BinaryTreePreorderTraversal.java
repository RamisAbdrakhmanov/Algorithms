package leetcode.binary_tree.easy;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        return addTolist(root,new ArrayList<>());
    }

    public List<Integer> addTolist(TreeNode node, List<Integer> list) {
        if (node == null) {
            return list;
        }

        list.add(node.val);
        addTolist(node.left, list);
        addTolist(node.right, list);
        return list;
    }
}
