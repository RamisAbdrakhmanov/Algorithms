package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        return addToList(root, new ArrayList<>());
    }

    public List<Integer> addToList(TreeNode node, List<Integer> list) {
        if (node == null) {
            return list;
        }

        addToList(node.left, list);
        addToList(node.right, list);
        list.add(node.val);
        return list;
    }
}
