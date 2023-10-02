package litcode.BinaryTree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        return addToList(root, new ArrayList<>(), new StringBuilder());
    }

    public List<String> addToList(TreeNode node, List<String> list, StringBuilder str) {
        if (node == null) {
            return list;
        }
        if (node.left == null && node.right == null) {
            list.add(String.valueOf(str.append(node.val)));
        }

        str.append(node.val).append("->");
        StringBuilder right = new StringBuilder();
        right.append(str);
        addToList(node.left, list, str);
        addToList(node.right, list, right);

        return list;
    }
}
