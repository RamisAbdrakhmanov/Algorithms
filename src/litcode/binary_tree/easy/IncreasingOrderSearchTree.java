package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addToList(root, list);
        TreeNode treeNode = new TreeNode();
        TreeNode ans = treeNode;
        for (int i = 0; i < list.size()-1; i++) {
            treeNode.val = list.get(i);
            treeNode.right = new TreeNode();
            treeNode = treeNode.right;
        }
        treeNode.val = list.get(list.size()-1);
        return ans;
    }

    public void addToList(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        addToList(node.left, list);
        list.add(node.val);
        addToList(node.right, list);
    }
}
