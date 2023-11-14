package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.*;

public class FindModeInBinarySearchTree {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{0};
        }
        List<Integer> list = new ArrayList<>();
        int max = addDuplicate(root, 0);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;

    }

    public int addDuplicate(TreeNode node, int max) {
        if (node == null) {
            return max;
        }
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        int count = map.get(node.val);
        if (count > max) {
            max = count;
        }
        return Math.max(addDuplicate(node.right, max), addDuplicate(node.left, max));
    }
}
