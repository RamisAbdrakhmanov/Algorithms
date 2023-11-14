package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    HashMap<Integer, Double[]> map = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        addToList(root, 0);
        int lvl = 0;
        while (map.containsKey(lvl)) {
            Double[] all = map.get(lvl);
            list.add((double)all[0] / all[1]);
            lvl++;
        }

        return list;
    }

    public void addToList(TreeNode node, int lvl) {
        if (node == null) {
            return;
        }

        Double[] arr;
        if (map.containsKey(lvl)) {
            arr = map.get(lvl);
            arr[0] += node.val;
            arr[1] += 1;
        } else {
            arr = new Double[]{(double) node.val, 1d};
        }
        map.put(lvl, arr);

        addToList(node.left, lvl + 1);
        addToList(node.right, lvl + 1);
    }
}
